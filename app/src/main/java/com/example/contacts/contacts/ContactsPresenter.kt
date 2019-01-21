package com.example.contacts.contacts

import com.example.contacts.ApiCaller
import com.example.contacts.App
import com.example.contacts.Contract
import com.example.contacts.model.Contacts
import com.example.contacts.model.SmsResponse
import com.example.contacts.room.MessageData
import com.example.contacts.room.MessageDatabase
import com.example.contacts.utils.CallBack
import com.example.contacts.utils.DbWorkerThread
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
    private var mDb: MessageDatabase? = null


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

        val internationalNumber = number.replace("+", "")
        val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val date = Date()
        val timeStamp = formatter.format(date).toString()

        view.setProgressBarVisibility(true)

        apiCaller.sendSMS(
            "UTX5oClzqdk-829TXj2DOmIy9guU6sc6IMdnciYqor",
            internationalNumber,
            message,
            "TXTLCL",
            object : CallBack<SmsResponse> {
                override fun onSuccess(t: SmsResponse) {
                    view.setProgressBarVisibility(false)
                    insertDataIntoDB(firstName, lastName, number, message, timeStamp)
                    view.onSuccessSendingSMS(t)
                }

                override fun onFailure(message: String) {
                    view.setProgressBarVisibility(false)
                    view.onErrorSendingSMS(message)
                }

            }
        )
    }


    private fun insertDataIntoDB(
        firstName: String,
        lastName: String,
        number: String,
        message: String,
        timeStamp: String
    ) {

        val task = Runnable {
            mDb?.messageDao()?.insert(
                MessageData(
                    firstName,
                    lastName,
                    number,
                    message,
                    timeStamp
                )
            )
        }

        mDbWorkerThread.postTask(task)
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