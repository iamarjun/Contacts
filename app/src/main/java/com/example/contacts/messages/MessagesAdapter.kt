package com.example.contacts.messages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amulyakhare.textdrawable.TextDrawable
import com.amulyakhare.textdrawable.util.ColorGenerator
import com.example.contacts.R
import com.example.contacts.room.MessageData
import kotlinx.android.synthetic.main.layout_message_item.view.*

class MessagesAdapter(private val messages: List<MessageData>) :
    RecyclerView.Adapter<MessagesAdapter.MessagesViewHolder>() {

    private var initial: Char? = null
    private var colorHolder: ArrayList<Int> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_message_item, parent, false)

        return MessagesViewHolder(view)
    }

    override fun getItemCount(): Int = messages.size

    override fun onBindViewHolder(holder: MessagesViewHolder, position: Int) {

        initial = messages[position].firstName.toString().toCharArray()[0]

        val generator = ColorGenerator.MATERIAL
        val randomColor = generator.randomColor

        colorHolder.add(randomColor)

        holder.mDP.setImageDrawable(
            TextDrawable.builder()
                .buildRound(initial.toString(), randomColor)
        )

        holder.mName.text = messages[position]!!.firstName + messages[position].lastName

        holder.mNumber.text = messages[position].number

        holder.mOTP.text = messages[position].otp

        holder.mTimeStamp.text = messages[position].dateTime

    }

    inner class MessagesViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val mDP = view.profile_pic
        val mName = view.name
        val mNumber = view.number
        val mOTP = view.otp
        val mTimeStamp = view.date_time

    }
}