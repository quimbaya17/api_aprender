package com.ronald.api_john

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ronald.api_john.model1.ManagerDb

class DatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        // Se obtienen las referencias de los EditText y el botón
        val edCodigo2 = findViewById<EditText>(R.id.ed_Codigo2)
        val ednombre = findViewById<EditText>(R.id.ed_nombre)
        val edtelefono = findViewById<EditText>(R.id.ed_telefono)
        val eddirection = findViewById<EditText>(R.id.ed_direccion)
        val edcedula = findViewById<EditText>(R.id.ed_cedula)
        val edprofesion = findViewById<EditText>(R.id.ed_profesion)
        val edciudad2 = findViewById<EditText>(R.id.ed_ciudad2)
        val btninsert2 = findViewById<Button>(R.id.button_insert2)

        // Configuración del listener para el botón de inserción
        btninsert2.setOnClickListener {
            val codigo = edCodigo2.text.toString()
            val nombre = ednombre.text.toString()
            val telefono = edtelefono.text.toString()
            val direccion = eddirection.text.toString()
            val cedula = edcedula.text.toString()
            val profesion = edprofesion.text.toString()
            val ciudad2 = edciudad2.text.toString()

            val bdManager = ManagerDb(this)
            val result2 = bdManager.insertData(codigo.toInt(), nombre, telefono.toInt(),
                direccion.toInt(), cedula, profesion, ciudad2)

            // Verificar el resultado de la inserción y mostrar un mensaje Toast
            if (result2 > 0) {
                Toast.makeText(this, "Datos insertados correctamente", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Error al insertar los datos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
