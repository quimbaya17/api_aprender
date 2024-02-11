package com.ronald.api_john.model1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Dbhelper (context: Context?) : SQLiteOpenHelper(context,Constantes.NOM_BD, null, Constantes.VERSION_BD){
    // extender de la clase sqliteopenhelper

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Constantes.TABLA)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS ciudad")
        onCreate(db)
    }
}