package com.ronald.api_john.model1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BdHelper(
    context: Context?)

    : SQLiteOpenHelper(context, Constantes.NOM_BD, null, Constantes.VERSION_BD ) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Constantes.TABLA)
        db?.execSQL(Constantes.TABLA2)
    }
    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("DROP TABLE IF EXISTs ciudad")
        onCreate(db)
    }

}


