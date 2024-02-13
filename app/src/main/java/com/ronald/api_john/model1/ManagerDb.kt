package com.ronald.api_john.model1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class ManagerDb(val context: Context) {
    lateinit var bd: SQLiteDatabase   // método de la bd

    val bdhelper = BdHelper(context)

    fun openBdWrite() {
        bd = bdhelper.writableDatabase
    }


    fun readBd(){
        bd = bdhelper.readableDatabase
    }



    fun insertDataCiudad(codigo: Int, ciudad: String): Long {
        openBdWrite()
        val values = ContentValues()
        values.put("codigo", codigo)
        values.put("ciudad", ciudad)

        val result = bd.insert("Ciudad", null, values)
        return result
    }

    fun insertData(codigo: Int, nombre: String, telefono: Int, cedula: Int, profesion: String,
                   ciudad: String, direccion: String): Long {

        // 1. Se abre la base de datos en escritura
        openBdWrite()
        // 2. Se crea el contenedor de valores para ingresar
        val contenedor = ContentValues()
        contenedor.put("telefono", telefono)
        contenedor.put("codigo", codigo)
        contenedor.put("nombre", nombre)
        contenedor.put("direccion", direccion)
        contenedor.put("cedula", cedula)
        contenedor.put("profesion", profesion)
        contenedor.put("ciudad", ciudad)
        // 3. Se llama al método insert
        val result2 = bd.insert("datos1", null, contenedor)
        return result2
    }
}
