package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tambah(view:View){
        val angka1 = findViewById<EditText>(R.id.angka1).text.toString()
        val angka2 = findViewById<EditText>(R.id.angka2).text.toString()
        val hasil = findViewById<TextView>(R.id.tvhasil)

        if(angka1.equals(""))
        {
            findViewById<EditText>(R.id.angka1).setError("Masukkan Angka Coy")
        }
        else if(angka2.equals(""))
        {
            findViewById<EditText>(R.id.angka2).setError("Masukkan Angka Coy")
        }
        else
        {
            val jumlah = angka1.toDouble() + angka2.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun kurang(view:View){
        val angka1 = findViewById<EditText>(R.id.angka1)
        val angka2 = findViewById<EditText>(R.id.angka2)
        val hasil = findViewById<TextView>(R.id.tvhasil)
        val jumlah = angka1.text.toString().toDouble() - angka2.text.toString().toDouble()
        hasil.text = jumlah.toString()
    }

    fun kali(view:View){
        val angka1 = findViewById<EditText>(R.id.angka1)
        val angka2 = findViewById<EditText>(R.id.angka2)
        val hasil = findViewById<TextView>(R.id.tvhasil)
        val jumlah = angka1.text.toString().toDouble() * angka2.text.toString().toDouble()
        hasil.text = jumlah.toString()
    }

    fun bagi(view:View){
        val angka1 = findViewById<EditText>(R.id.angka1)
        val angka2 = findViewById<EditText>(R.id.angka2)
        val hasil = findViewById<TextView>(R.id.tvhasil)
        val jumlah = angka1.text.toString().toDouble() / angka2.text.toString().toDouble()
        hasil.text = jumlah.toString()
    }

    fun bersih(view: View){
        findViewById<EditText>(R.id.angka1).text.clear()
        findViewById<EditText>(R.id.angka2).text.clear()
        findViewById<TextView>(R.id.tvhasil).text='0'.toString()
    }


}