package com.example.contacts


interface BaseView<in T> {
    fun setPresenter(presenter: T)
}
