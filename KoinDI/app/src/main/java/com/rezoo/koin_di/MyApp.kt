package com.rezoo.koin_di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        //Start Koin
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
           modules(appModule)
        }
    }
}