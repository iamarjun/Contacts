package com.example.contacts.contacts


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.contacts.Contract
import com.example.contacts.R
import com.example.contacts.model.Contacts


class ContactsFragment : Fragment(), Contract.ContactsView {

    private lateinit var mView: View

    init {
        setPresenter(ContactsPresenter(this))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_contacts, container, false)



        return mView
    }

    override fun onSuccessGettingAllContacts(response: Contacts) {
    }

    override fun onErrorGettingContacts(message: String) {
    }

    override fun setPresenter(presenter: Contract.ContactsPresenter) {
    }


}
