package com.example.administrator.myapplication

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    var context: MainActivity? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        //这是第二个分支
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        // Example of a call to a native method
        sample_text.text = "2222222222222"
        sample_text.setOnClickListener {
            startActivity(Intent(
                    context,
                    Main2Activity::class.java
            ))
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onstarEvent(){

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent(){
        Thread{
            sleep(1000)
        }.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent2(){
        Thread{
            sleep(1000)
        }.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun  onPauseEvent(){
        
    }

    inner class LogUtils{

        fun logStar(){

        }

        fun logStop(){

        }
    }
}