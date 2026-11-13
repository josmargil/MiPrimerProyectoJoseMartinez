package com.jose_martinez.sprint1josemartinez

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.jose_martinez.sprint1josemartinez.databinding.Reto1Binding

class MainActivity : ComponentActivity() {

    private lateinit var binding: Reto1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Reto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Funcionalidad 1
        binding.btnGuardar.setOnClickListener {
            val name = binding.etNombre.text.toString()

            if (name.isNotEmpty()) {
                binding.tvResultado.text = "Hola $name"
            } else {
                binding.tvResultado.text = "Introduce tu nombre"
            }
        }

        // Funcionalidad 2
        binding.cbAndroid.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Has seleccionado: Android", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Android ha sido desmarcado", Toast.LENGTH_SHORT).show()
            }
        }

        binding.cbReact.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Has seleccionado: React", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "React ha sido desmarcado", Toast.LENGTH_SHORT).show()
            }
        }

        binding.cbFlutter.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Has seleccionado: Flutter", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Flutter ha sido desmarcado", Toast.LENGTH_SHORT).show()
            }
        }

        // Funcionalidad 3
        binding.btnGuardar2.setOnClickListener {
            if (binding.pbProgreso.progress < 100) {
                binding.pbProgreso.progress += 10
            } else {
                binding.pbProgreso.progress = 0
            }
        }
    }
}