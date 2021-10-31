package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        var a =  b.text
        var b=   d.text
        var c=   e.text
        var d=   z.text
        var e=   h.text

        boton.setOnClickListener {
            var  Contenedordetextos:TextView=findViewById(R.id.contenedordetextos) as TextView
            var TextoMostrar: String="Uno de los personajes más adjetivos de la ficción se llama Tarzán del lopez Tarzán fue criado por un  sustantivo y vive en la jungla adjetivos en el corazón del lugar más oscuro. Pasa la mayor parte de su tiempo comiendo lopez y columpiándose de un árbol a sustantivo. Siempre que se enoja, se golpea el pecho y dice: ruido  Este es su grito de guerra. Tarzán siempre se viste de adjetivos pantalones cortos hechos con la piel de un  sustantivo y su mejor amigo es un chimpancé adjetivos llamado Leopardo. Se supone que puede hablar con elefantes y lopez. En las películas, Tarzán es interpretado por alguien." .replace("adjetivos","$a" )
            var segundotexto: String=TextoMostrar.toString() .replace("lopez","$c" )
            var tercertexto: String=segundotexto.toString() .replace("sustantivo","$b" )
            var cuartotexto: String=tercertexto.toString() .replace("ruido","$d" )
            var quintotexto:String=cuartotexto.toString() .replace("alguien","$e" )
            Contenedordetextos.text=quintotexto.toString()





        }






    }
}