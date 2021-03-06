package com.example.contacts

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.example.contacts.contacts.ContactsFragment
import com.example.contacts.messages.MessagesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        toolbar.title = "Contacts"
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white))

        bottom_navigation.setOnNavigationItemSelectedListener(this)
        viewpager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                bottom_navigation.menu.getItem(position).isChecked = true
            }

        })

        setupViewPager()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    private fun setupViewPager() {

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ContactsFragment())
        adapter.addFragment(MessagesFragment())
        viewpager.adapter = adapter

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.contacts -> viewpager.currentItem = 0
            R.id.messages -> viewpager.currentItem = 1
        }

        return true
    }
}
