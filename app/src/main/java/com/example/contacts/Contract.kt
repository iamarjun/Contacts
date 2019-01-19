package com.example.contacts

import com.example.contacts.model.Contacts

interface Contract {

    interface ContactsView : BaseView<ContactsPresenter> {
        fun onSuccessGettingAllContacts(response : Contacts)
        fun onErrorGettingContacts(message : String)
    }

    interface ContactsPresenter : BasePresenter {
        fun getAllContacts()
    }
}