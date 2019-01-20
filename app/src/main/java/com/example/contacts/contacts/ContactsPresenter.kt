package com.example.contacts.contacts

import android.util.Base64
import com.example.contacts.ApiCaller
import com.example.contacts.App
import com.example.contacts.Contract
import com.example.contacts.model.Contacts
import com.example.contacts.utils.CallBack
import com.google.android.material.snackbar.Snackbar
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import java.text.DateFormat
import java.util.*
import javax.inject.Inject


class ContactsPresenter(private val view: Contract.ContactsView) : Contract.ContactsPresenter {

    @Inject
    internal lateinit var apiCaller: ApiCaller

    init {
        App.appComponent!!.inject(this)
    }

    private val saveData: Disposable
        get() = Single.fromCallable<Unit> { this.loadData() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError { it.printStackTrace() }
            .subscribe(Consumer<Unit> { })

    private fun loadData() {
        val url = "https://api.twilio.com/2010-04-01/Accounts/ACdd6dd112720aadbd4d20782555f0923c/SMS/Messages"
        val base64EncodedCredentials = "Basic " + Base64.encodeToString(
            ("ACdd6dd112720aadbd4d20782555f0923c:cdf7cf1b6cc8a2ab0e221013c4a7d397").toByteArray(),
            Base64.NO_WRAP
        )

        val body = FormBody.Builder()
            .add("From", "+16092241426")
            .add("To", "+918800402310")
            .add("Body", "Hi")
            .build()

        val request = Request.Builder()
            .url(url)
            .post(body)
            .header("Authorization", base64EncodedCredentials)
            .build()
        try {
            val client = OkHttpClient()
            val response = client.newCall(request).execute()

            if (response.isSuccessful)
                view.onSuccessSendingSMS(response)
            else
                view.onErrorSendingSMS(response.message())


//            DatabaseHelper.writeMessage(
//                activity.getApplicationContext(),
//                Message(this.contact, mOtpCode, currentDateTime)
//            )
//            Log.d(TAG, "sendSms: " + response.body()!!.string())

        } catch (e: IOException) {
            e.printStackTrace()
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


    override fun sendSMS(number: String, message: String) {

//        val base64EncodedCredentials = "Basic " + Base64.encodeToString(
//            (Constants.ACCOUNT_SID + ":" + Constants.AUTH_TOKEN).toByteArray(),
//            Base64.NO_WRAP
//        )
//
//        val data = mapOf(
//            "From" to Constants.MY_NUMBER,
//            "To" to number,
//            "Body" to message
//        )
//
//        apiCaller.sendSMS(Constants.ACCOUNT_SID, base64EncodedCredentials, data, object : CallBack<ResponseBody> {
//            override fun onSuccess(t: ResponseBody) {
//                view.onSuccessSendingSMS(t)
//            }
//
//            override fun onFailure(message: String) {
//                view.onErrorSendingSMS(message)
//            }
//
//        })

        val currentDateTime = DateFormat.getDateTimeInstance().format(Date())

        saveData
    }

    override fun onAttach() {
    }

    override fun onDetach() {
    }

}