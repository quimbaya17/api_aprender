package com.ronald.api_john.model1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ronald.api_john.R
import com.ronald.api_john.DatosActivity
import com.ronald.api_john.model1.ManagerDb
import com.ronald.api_john.model1.BdHelper

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edCodigo = findViewById<EditText>(R.id.ed_Codigo)
        val edCiudad = findViewById<EditText>(R.id.ed_ciudad)
        val btnInsert = findViewById<Button>(R.id.button_insert)

        btnInsert.setOnClickListener {
            val codigo = edCodigo.text.toString()
            val ciudad = edCiudad.text.toString()

            val bdManager = ManagerDb(this)
            val result = bdManager.insertDataCiudad(codigo.toInt(), ciudad)

            if (result > 0) {
                Toast.makeText(this, "Datos insertados con éxito", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Error al ingresar datos", Toast.LENGTH_SHORT).show()
            }
            intent = Intent(this, DatosActivity::class.java)
            startActivity(intent)
        }

    }
}
