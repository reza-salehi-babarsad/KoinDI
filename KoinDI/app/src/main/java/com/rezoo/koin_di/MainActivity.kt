package com.rezoo.koin_di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    val presenter:UserPresent by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Start Koin
        /*startKoin {
            //androidLogger()
           // androidContext(this@MyApp)
            modules(appModule)
        }*/

        var txtshow=findViewById<TextView>(R.id.textShow)
        var data:String=""
        for (user in presenter.getUsers()){
            data+=user.toString()+"\n"
        }
        txtshow.text=data
    }
}