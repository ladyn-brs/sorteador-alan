package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    fun sortear(view: view){
        val textResultado = findViewById<TestView>(R. id. textResultado)
        val numero = Random.nextInt(11) //de 0 a 10
<<<<<<< HEAD
        textResultado.setText("Numero sorteado: $numero")
=======
        textResultado.setText("Casal Sorteado: $numero")
>>>>>>> 14683023d970a77186db68427898bea66a311f69
    }
}