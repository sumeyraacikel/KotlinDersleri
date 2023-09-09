package com.example.kotlindersleri.collections

fun main() {
    val meyveler = ArrayList<String>()

    //Veri ekleme
    meyveler.add("Elma")//0.
    meyveler.add("Muz")//1.
    meyveler.add("Kiraz")//2.

    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert
    meyveler.add(1, "Portakal")
    println(meyveler)

    //Okuma
    val meyve = meyveler.get(0)//meyveler[0]
    println(meyve)

    println("Boyut: ${meyveler.size}")

    meyveler.sort()//sıralama
    println(meyveler)

    for ((i, m) in meyveler.withIndex()){ //sırasıyla gösteriyor. Foreach yapısı da denir.
        println("Sonuc: $i. -> $m")

    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)

    //Mutable: hem okuma hem yazma
    //Immutable : Sadece okunabilen diziler
}