package com.example.deeplinkexample

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.deeplinkexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var uri : Uri? = intent.data
        if(uri != null){
            val parameters = uri.pathSegments
            val param = parameters[0]
            binding.idTVMessage.text = param
        }


    }
}