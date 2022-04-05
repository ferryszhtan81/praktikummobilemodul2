package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Tombol Gulung Dadu
        val TombolGulung: Button = findViewById(R.id.button)
        TombolGulung.setOnClickListener { gulungDadu() }
    }
    private fun gulungDadu() {
        //Untuk membuat dadu dengan 6 mata dadu
        val dadu = Dadu(6)
        val daduGulung = dadu.Gulung()

        //Untuk mengubah layar
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = daduGulung.toString()
    }
}

class Dadu(private val mataDadu: Int) {
    fun Gulung(): Int {
        return (1..mataDadu).random()
    }
}