package com.example.administrator.myapplication

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.administrator.myapplication.R.layout.activity_main2
import com.example.administrator.myapplication.databinding.ActivityMain2Binding
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val activityMain2Binding = DataBindingUtil.setContentView<ActivityMain2Binding>(this, R.layout.activity_main2)
        btn_test.setOnClickListener{
            val user = UserBean("GG",18,"18888888888")
            activityMain2Binding.user = user
        }

    }
}
