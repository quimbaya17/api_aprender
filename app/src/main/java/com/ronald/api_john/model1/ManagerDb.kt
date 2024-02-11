package com.ronald.api_john.model1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class ManagerDb ( val context : Context){
    lateinit var bd: SQLiteDatabase   // metodo de la bd

    val bdhelper = Dbhelper(context)

    fun openBdWr(){
        bd = bdhelper.writableDatabase

    }

    fun openBdRd(){
       bd = bdhelper.readableDatabase
    }

    fun insertData():Long {
        // 1.se abre la base de datos en escritura
        openBdWr()
        //2. se crea el contenedor de valores para ingresar

        val contenedor = ContentValues()
        contenedor.put("codigo",1)
        contenedor.put("nombre" , "neiva")
        contenedor.put("cod_ciudad" , 54)
        // se llama al metodo insert

        val result = bd.insert( "Ciudad", null, contenedor)
        return result

    }

}