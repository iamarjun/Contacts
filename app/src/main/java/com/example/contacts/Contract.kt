package com.example.contacts

import com.example.contacts.model.Contacts
import okhttp3.Response
import okhttp3.ResponseBody

interface Contract {

    interface ContactsView : BaseView<ContactsPresenter> {
        fun onSuccessGettingAllContacts(response : Contacts)
        fun onErrorGettingContacts(message : String)
        fun setProgressBarVisibility(visibility: Boolean)
        fun onSuccessSendingSMS(t: Response)
        fun onErrorSendingSMS(message: String)
    }

    interface ContactsPresenter : BasePresenter {
        fun getAllContacts()
        fun sendSMS(firstName: String, lastName:String, number: String, message: String)
    }
}