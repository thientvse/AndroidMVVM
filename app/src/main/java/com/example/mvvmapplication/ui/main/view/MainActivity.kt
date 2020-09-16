package com.example.mvvmapplication.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmapplication.R
import com.example.mvvmapplication.ui.main.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}