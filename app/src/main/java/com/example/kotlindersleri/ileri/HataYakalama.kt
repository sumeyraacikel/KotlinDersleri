package com.example.kotlindersleri.ileri

import java.lang.Exception

fun main() {
    //1. Compile error
    val sayi = 10
    //sayi = 20

    //2.Runtime Error : Exception
    val x = 10
    val y = 0

    try {
        println("Sonuc : ${x/y}")
        println("İşlem bitti")
    }catch (e:Exception){
        println("Hata oluştu")
    }
}