package com.heheguoji.caiyundemo

import android.app.Application
import android.content.Context
import kotlinx.coroutines.*

class MyApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "CtgXsIqKn3HjdrkC"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}

