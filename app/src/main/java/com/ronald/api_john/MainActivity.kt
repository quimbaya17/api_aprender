package com.ronald.api_john.model1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ronald.api_john.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

package com.ronald.api_john.model1
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Activity_main)
        val btninsertar = findViewById<Button>(R.id.button)
        btninsertar.setOnClickListener{

            val managerDb = ManagerDb(  this)
            val result = managerDb.insertData()  // aca se llama el metodo para la tabla ciudad

            if (result >0) {
                Toast.makeText(this, "DATOS INSERTADOS" + Result, Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText( this, "problemas al Insertar " + result,Toast.LENGTH_SHORT).show()
            }

        }
    }
}