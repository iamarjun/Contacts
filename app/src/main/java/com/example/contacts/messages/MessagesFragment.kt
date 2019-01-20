package com.example.contacts.messages


import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.contacts.R
import com.example.contacts.room.MessageDatabase
import com.example.contacts.utils.DbWorkerThread
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_messages.view.*

class MessagesFragment : Fragment(), SwipeRefreshLayout.OnRefreshListener {

    private lateinit var mView: View
    private lateinit var mDbWorkerThread: DbWorkerThread
    private val mUiHandler = Handler()
    private var mDb: MessageDatabase? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_messages, container, false)

        mView.refresh.setOnRefreshListener(this)

        mDb = MessageDatabase.getInstance(activity!!)
        mDbWorkerThread = DbWorkerThread("dbWorkerThread")
        mDbWorkerThread.start()

        setupRecycler()

        return mView
    }

    override fun onResume() {
        super.onResume()
        fetchDataFromDB()
    }

    override fun onRefresh() {
        fetchDataFromDB()
    }

    private fun fetchDataFromDB() {
        val task = Runnable {
            val messages = mDb?.messageDao()?.getAllMessages()
            mUiHandler.post {
                if (messages == null || messages.isEmpty()) {
                    Snackbar.make(mView, "No data in cache..!!", Snackbar.LENGTH_SHORT)
                    mView.progress.visibility = View.GONE
                    mView.refresh.isRefreshing = false
                } else {
                    mView.recycler_messages.adapter = MessagesAdapter(messages)
                    mView.progress.visibility = View.GONE
                    mView.refresh.isRefreshing = false
                }
            }
        }

        mDbWorkerThread.postTask(task)
    }

    private fun setupRecycler() {
        val linearLayout = LinearLayoutManager(activity!!, RecyclerView.VERTICAL, true)
        mView.recycler_messages.layoutManager = linearLayout

        val divider = DividerItemDecoration(activity!!, linearLayout.orientation)
        mView.recycler_messages.addItemDecoration(divider)
    }


}
