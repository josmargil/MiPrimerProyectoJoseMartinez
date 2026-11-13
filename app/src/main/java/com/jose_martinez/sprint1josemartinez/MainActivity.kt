package com.jose_martinez.sprint1josemartinez

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.jose_martinez.sprint1josemartinez.databinding.Reto1Binding

class MainActivity : ComponentActivity() {

    private lateinit var binding: Reto1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Reto1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}