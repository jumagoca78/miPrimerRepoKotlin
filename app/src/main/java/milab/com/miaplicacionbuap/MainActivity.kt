package milab.com.miaplicacionbuap

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val minumero=2
        val string= "hola"
        val flotante= 0.23f
        val doble= 0.23

        var miNumero2 = 4
        var otracosa = "Hola"

        var miVariableNula:String? = null //?ayuda a especificar que pudiera ser nula

        val tamano = miVariableNula?.length //? si llega a ser nula no le asignes nada


        Log.d("Mi String", "Hola, amo Kotlin")

        }
    }

data class Carro (val color:String, val modelo:String)

class Tren (val vagones:Int): Mover {
    override fun detener
}

interface Mover {
    fun arrancar (){
        return "run run"
    }

    fun arrancar2 () = "run run"

    fun detener():String
}



