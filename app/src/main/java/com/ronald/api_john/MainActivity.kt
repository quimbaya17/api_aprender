package com.ronald.api_john.model1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.ronald.api_john.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btninsertar = findViewById<Button>(R.id.button_insert)
        btninsertar.setOnClickListener{

            val managerDb = ManagerDb(this)
            val result = managerDb.insertData()  // aquí se llama al método para insertar en la tabla ciudad

            if (result > 0) {
                Toast.makeText(this, "DATOS INSERTADOS" + result, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Problemas al Insertar" + result, Toast.LENGTH_SHORT).show()
            }

        }
    }
}