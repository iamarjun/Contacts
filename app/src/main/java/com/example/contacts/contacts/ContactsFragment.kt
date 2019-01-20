package com.example.contacts.contacts


import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.amulyakhare.textdrawable.util.ColorGenerator
import com.example.contacts.Contract
import com.example.contacts.R
import com.example.contacts.model.Contact
import com.example.contacts.model.Contacts
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_contacts.view.*
import kotlinx.android.synthetic.main.layout_contact_details.view.*
import okhttp3.Response
import okhttp3.ResponseBody
import java.util.*


class ContactsFragment : Fragment(), Contract.ContactsView, ContactsAdapter.ItemClickListener,
    SwipeRefreshLayout.OnRefreshListener {

    private lateinit var mView: View
    private lateinit var mBottomSheetView: View
    private lateinit var mProgressBar: ProgressBar
    private lateinit var presenter: Contract.ContactsPresenter
    private lateinit var mBottomSheetDialog: BottomSheetDialog
    private lateinit var mContactsList: List<Contact?>

    init {
        setPresenter(ContactsPresenter(this))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_contacts, container, false)

        mProgressBar = ProgressBar(activity, null, android.R.attr.progressBarStyleLarge)
        mView.refresh.setOnRefreshListener(this)

        setupRecycler()
        setupBottomSheetDialog()

        return mView
    }

    override fun onResume() {
        super.onResume()

        presenter.getAllContacts()
    }

    override fun onRefresh() {
        presenter.getAllContacts()
    }

    private fun setupBottomSheetDialog() {
        mBottomSheetDialog = BottomSheetDialog(activity!!)
        mBottomSheetView = activity!!.layoutInflater.inflate(R.layout.layout_contact_details, null)
        mBottomSheetDialog.setContentView(mBottomSheetView)
    }

    private fun setupRecycler() {

        val linearLayout = LinearLayoutManager(activity!!, RecyclerView.VERTICAL, false)
        mView.recycler_contacts_list.layoutManager = linearLayout

        val divider = DividerItemDecoration(mView.recycler_contacts_list.context!!, linearLayout.orientation)
        mView.recycler_contacts_list.addItemDecoration(divider)
    }

    override fun onItemClick(position: Int, colorHolder: ArrayList<Int>) {
        mBottomSheetDialog.show()

        if (::mContactsList.isInitialized) {
            mBottomSheetView.backdrop.setBackgroundColor(colorHolder[position])
            mBottomSheetView.frist_name.text = mContactsList[position]!!.firstName
            mBottomSheetView.last_name.text = mContactsList[position]!!.lastName
            mBottomSheetView.number.text = mContactsList[position]!!.contactNumber
            mBottomSheetView.message.setText(populateDefaultMessage())
        }

        mBottomSheetView.send_otp.setOnClickListener {
            if (mBottomSheetView.message.text!!.isNotEmpty()) {
                mBottomSheetView.layout_message.error = null
                presenter.sendSMS(mBottomSheetView.number.text.toString(), mBottomSheetView.message.text.toString())
            }
            else
                mBottomSheetView.layout_message.error = "SMS Cannot Be Empty."
        }

    }

    private fun populateDefaultMessage() : String = "Hi, Your OTP is ${generateOTP()}."

    private fun generateOTP(): Int {
        val rnd = Random()
        val otp = 100000 + rnd.nextInt(900000)

        return otp
    }

    override fun setProgressBarVisibility(visibility: Boolean) {
        if (visibility)
            mProgressBar.visibility = View.VISIBLE
        else
            mProgressBar.visibility = View.GONE
    }

    override fun onSuccessGettingAllContacts(response: Contacts) {
        mContactsList = response.contacts!!
        mView.refresh.isRefreshing = false
        mView.recycler_contacts_list.adapter = ContactsAdapter(this, response.contacts)
    }

    override fun onErrorGettingContacts(message: String) {
        mView.refresh.isRefreshing = false
        Snackbar.make(mView, message, Snackbar.LENGTH_SHORT)
            .show()
    }

    override fun onSuccessSendingSMS(t: Response) {
        Snackbar.make(mView, t.message(), Snackbar.LENGTH_SHORT)
            .show()
    }

    override fun onErrorSendingSMS(message: String) {
        Snackbar.make(mView, message, Snackbar.LENGTH_SHORT)
            .show()
    }

    override fun setPresenter(presenter: Contract.ContactsPresenter) {
        this.presenter = presenter
    }

    companion object {
    }

}
