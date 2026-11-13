package com.jose_martinez.sprint1josemartinez

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.jose_martinez.sprint1josemartinez.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myCard.titulo = "Android Studio"
        binding.myCard.descripcion = "Aprende a crear interfaces Android"
        binding.myCard.textoBoton = "Ver curso"

        binding.myCard.setOnAccionClickListener {
            Toast.makeText(this, "Vamos al curso", Toast.LENGTH_SHORT).show()
        }
    }
}