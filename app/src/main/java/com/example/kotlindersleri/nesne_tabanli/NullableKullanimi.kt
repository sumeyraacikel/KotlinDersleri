package com.example.kotlindersleri.nesne_tabanli

fun main() {
    //Nullable - Null Safety - Optional(Swift)
    //null - NaN - nil

    //Tanımlama
    var mesaj:String? = null

   mesaj = "merhaba"

    //Yöntem 1
    println("Yöntem 1 : ${mesaj?.uppercase()}")

    //Yöntem 2
    //println("Yöntem 2 : ${mesaj!!.uppercase()}")

    //Yöntem 3
    if (mesaj != null){
        println("Yöntem 3 : ${mesaj?.uppercase()}")

    }else{
        println("null'dur")

    }

    //Yöntem 4
    mesaj?.let {
        println("Yöntem 4 : ${mesaj.uppercase()}")

    }// else yok




}