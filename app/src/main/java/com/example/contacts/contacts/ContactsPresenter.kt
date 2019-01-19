package com.example.contacts.contacts

import com.example.contacts.ApiCaller
import com.example.contacts.App
import com.example.contacts.Contract
import com.example.contacts.model.Contacts
import com.example.contacts.utils.CallBack
import javax.inject.Inject

class ContactsPresenter(private val view: Contract.ContactsView) : Contract.ContactsPresenter {

    @Inject
    internal lateinit var apiCaller: ApiCaller

    init {
        App.appComponent!!.inject(this)
    }

    override fun getAllContacts() {
        apiCaller.getAllContacts(object : CallBack<Contacts> {
            override fun onSuccess(t: Contacts) {
                view.onSuccessGettingAllContacts(t)
            }

            override fun onFailure(message: String) {
                view.onErrorGettingContacts(message)
            }

        })
    }

    override fun onAttach() {
    }

    override fun onDetach() {
    }

}