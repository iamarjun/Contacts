package com.example.contacts

import com.example.contacts.model.Contacts
import com.example.contacts.network.Client
import com.example.contacts.utils.CallBack
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import okhttp3.ResponseBody
import javax.inject.Inject

class ApiCaller : ApiWrapper {

    @Inject
    internal lateinit var client: Client

    init {
        App.appComponent!!.inject(this)
    }


    override fun getAllContacts(callBack: CallBack<Contacts>) {
        client.getAllContacts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableObserver<Contacts>() {
                override fun onComplete() {
                }

                override fun onNext(t: Contacts) {
                    callBack.onSuccess(t)
                }

                override fun onError(e: Throwable) {
                    callBack.onFailure(e.message ?: ERROR_LOADING_RESULT)
                }

            })
    }


    companion object {
        private const val ERROR_LOADING_RESULT = "Error Loading Result"
    }

}