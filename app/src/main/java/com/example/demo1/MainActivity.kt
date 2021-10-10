package com.example.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClickBoton(view: View) {
        var txtNombre:EditText=findViewById(R.id.txtNombre)
        val nombre:String=txtNombre.text.toString()

        Toast.makeText(this, "hola ${nombre}",Toast.LENGTH_LONG).show()

    }

}