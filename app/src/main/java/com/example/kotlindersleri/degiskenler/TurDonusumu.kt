package com.example.kotlindersleri.degiskenler

fun main() {
    //Sayısaldan sayısala
    val i = 42
    val d = 78.95 //yuvarlama yok

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    //Sayısaldan metine
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    //Metinden sayısala
    val yazi = "67.54"

    val sonuc5 = yazi.toDoubleOrNull()

    if (sonuc5 != null){
        println(sonuc5)
    }else {
        println("Dönüşüm hatası")
    }

    val metin = "56"

    val sonuc6 = metin.toIntOrNull()

    sonuc6?.let {
        println(it)// it=sonuc6
    }
}