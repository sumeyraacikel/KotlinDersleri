package com.example.kotlindersleri.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler)

    meyveler.add("elma")
    println(meyveler)

    val meyve = meyveler.elementAt(1)
    println(meyve)

    println("Boyut : ${meyveler.size}")

    for (m in meyveler){
        println("Sonuç: $m")
    }
    for ((i, m) in meyveler.withIndex()){
        println("$i. -> $m")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}