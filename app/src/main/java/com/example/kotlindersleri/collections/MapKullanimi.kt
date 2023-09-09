package com.example.kotlindersleri.collections

fun main() {
    //Dictionary
    //Json = HashMap
    val iller = HashMap<Int, String>()
    iller.put(16, "BURSA")
    iller.put(34,"İSTANBUL")
    iller[6] = "ANKARA"

    println(iller)
    val il = iller.get(16)
    println(il)

    iller[16] = "YENİ BURSA"
    println(iller)

    println("Boyut : ${iller.size}")

    for ((anahtar, deger) in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(16)
    println(iller)

    iller.clear()
    println(iller)
}