package com.example.contacts.contacts

import android.os.Handler
import com.example.contacts.ApiCaller
import com.example.contacts.App
import com.example.contacts.Contract
import com.example.contacts.model.Contacts
import com.example.contacts.room.MessageData
import com.example.contacts.room.MessageDatabase
import com.example.contacts.utils.CallBack
import com.example.contacts.utils.DbWorkerThread
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.net.URLEncoder
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class ContactsPresenter(private val view: Contract.ContactsView) : Contract.ContactsPresenter {

    @Inject
    internal lateinit var apiCaller: ApiCaller

    init {
        App.appComponent.inject(this)
    }

    private lateinit var mDbWorkerThread: DbWorkerThread
    private var mDb : MessageDatabase? = null

    private val saveData: Disposable
        get() = Single.fromCallable<Unit> { this.sendSms() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError { it.printStackTrace() }
            .subscribe(Consumer<Unit> { })


    fun sendSms(): String {
        try {
            // Construct data
            val apiKey = "apikey=" + URLEncoder.encode("ynGkhwJRoEE-CsEc3XGbQZsMQtpywDBaiduXtu0iaT\t", "UTF-8")
            val message = "&otp=" + URLEncoder.encode("Hi", "UTF-8")
            val sender = "&sender=" + URLEncoder.encode("TXTLCL", "UTF-8")
            val numbers = "&numbers=" + URLEncoder.encode("918800147934", "UTF-8")

            // Send data
            val data = "https://api.textlocal.in/send/?$apiKey$numbers$message$sender"
            val url = URL(data)
            val conn = url.openConnection()
            conn.doOutput = true

            // Get the response
            val rd = BufferedReader(InputStreamReader(conn.getInputStream()))
            val line: String
            var sResult = ""
            line = rd.readLine()
            while ((line) != null) {
                // Process line...
                sResult = "$sResult$line "
            }
            rd.close()

            return sResult
        } catch (e: Exception) {
            println("Error SMS $e")
            return "Error $e"
        }

    }


    override fun getAllContacts() {

        view.setProgressBarVisibility(true)

        apiCaller.getAllContacts(object : CallBack<Contacts> {
            override fun onSuccess(t: Contacts) {
                view.setProgressBarVisibility(false)
                view.onSuccessGettingAllContacts(t)
            }

            override fun onFailure(message: String) {
                view.setProgressBarVisibility(false)
                view.onErrorGettingContacts(message)
            }

        })
    }


    override fun sendSMS(firstName: String, lastName: String, number: String, message: String) {

//        val base64EncodedCredentials = "Basic " + Base64.encodeToString(
//            (Constants.ACCOUNT_SID + ":" + Constants.AUTH_TOKEN).toByteArray(),
//            Base64.NO_WRAP
//        )
//
//        val data = mapOf(
//            "From" to Constants.MY_NUMBER,
//            "To" to number,
//            "Body" to otp
//        )
//
//        apiCaller.sendSMS(Constants.ACCOUNT_SID, base64EncodedCredentials, data, object : CallBack<ResponseBody> {
//            override fun onSuccess(t: ResponseBody) {
//                view.onSuccessSendingSMS(t)
//            }
//
//            override fun onFailure(otp: String) {
//                view.onErrorSendingSMS(otp)
//            }
//
//        })

        val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val date = Date()
        val timeStamp = formatter.format(date).toString()

        val task = Runnable { mDb?.messageDao()?.insert(MessageData(
            firstName,
            lastName,
            number,
            message,
            timeStamp
        )) }
        mDbWorkerThread.postTask(task)

        saveData
    }

    override fun onAttach() {
        mDb = MessageDatabase.getInstance(App.appContext)
        mDbWorkerThread = DbWorkerThread("dbWorkerThread")
        mDbWorkerThread.start()
    }

    override fun onDetach() {
        MessageDatabase.destroyInstance()
    }

}