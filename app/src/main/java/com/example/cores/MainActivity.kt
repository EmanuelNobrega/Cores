package com.example.cores

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var btNova: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btNova = findViewById(R.id.MudarDeCor)
        btNova.setBackgroundColor(Color.WHITE)



        btNova.setOnClickListener { setNewColor(it) }

    }

    fun setNewColor(view: View){
        var cores = MudarCor().getColor()
        val list = """
            red:   ${cores.elementAt(0)}
            green: ${cores.elementAt(1)}
            blue:  ${cores.elementAt(2)}
        """.trimIndent()
        btNova.text = list
        btNova.setBackgroundColor(Color.argb(255,cores.elementAt(0),cores.elementAt(1),cores.elementAt(2)))
    }


}
