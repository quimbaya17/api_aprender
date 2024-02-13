package com.ronald.api_john.model1

import android.os.Build.VERSION

class Constantes {
    companion object{
        const val NOM_BD = "BdUsuario"
        const val VERSION_BD = 2

        const val TABLA =" create table Ciudad  (codigo int , ciudad text)"
        const val TABLA2 ="create table datos1 (nombre text, codigo int ,telefono int ,direccion text , cedula int , profesion text, ciudad text)"
    }
}