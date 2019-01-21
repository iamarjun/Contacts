package com.example.contacts

import com.example.contacts.model.Contacts
import com.example.contacts.model.SmsResponse

interface Contract {

    interface ContactsView : BaseView<ContactsPresenter> {
        fun onSuccessGettingAllContacts(response: Contacts)
        fun onErrorGettingContacts(message: String)
        fun setProgressBarVisibility(visibility: Boolean)
        fun onSuccessSendingSMS(t: SmsResponse)
        fun onErrorSendingSMS(message: String)
    }

    interface ContactsPresenter : BasePresenter {
        fun getAllContacts()
        fun sendSMS(firstName: String, lastName: String, number: String, message: String)
    }
}