package com.example.contacts.contacts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amulyakhare.textdrawable.TextDrawable
import com.amulyakhare.textdrawable.util.ColorGenerator
import com.example.contacts.R
import com.example.contacts.model.Contact
import kotlinx.android.synthetic.main.layout_contacts_item.view.*

class ContactsAdapter(private val listener: ItemClickListener, private val contactsList: List<Contact?>?) :
    RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {

    interface ItemClickListener {
        fun onItemClick(position: Int, colorHolder: ArrayList<Int>)
    }

    private var initial: Char? = null
    private var colorHolder: ArrayList<Int> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_contacts_item, parent, false)
        return ContactsViewHolder(listener, view)
    }

    override fun getItemCount(): Int = contactsList!!.size

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {

        initial = contactsList!![position]!!.firstName.toString().toCharArray()[0]

        val generator = ColorGenerator.MATERIAL
        val randomColor = generator.randomColor

        colorHolder.add(randomColor)

        holder.mDP.setImageDrawable(
            TextDrawable.builder()
                .buildRound(initial.toString(), randomColor)
        )

        holder.mName.text = contactsList[position]!!.firstName

    }

    inner class ContactsViewHolder(private val listener: ItemClickListener, private val view: View) :
        RecyclerView.ViewHolder(view) {

        val mDP = view.profile_pic
        val mName = view.first_name

        init {
            view.setOnClickListener {
                listener.onItemClick(adapterPosition, colorHolder)
            }
        }
    }

}