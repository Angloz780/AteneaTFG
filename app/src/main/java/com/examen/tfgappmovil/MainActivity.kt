package com.examen.tfgappmovil

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged



class LoginActivity : AppCompatActivity() {


    private fun showAlert() {
        val builder= android.app.AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("El usuario no se encuentra registrado dentro de la app contacte con el servicio tecnico")
        builder.setPositiveButton("Salir",null)
        val dialog: android.app.AlertDialog =builder.create()
        dialog.show()
    }
}
