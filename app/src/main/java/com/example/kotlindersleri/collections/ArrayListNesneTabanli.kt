package com.example.kotlindersleri.collections

fun main() {
    val o1 = Ogrenciler(200, "Zeynep")
    val o2 = Ogrenciler(300, "Ahmet")
    val o3 = Ogrenciler(100, "Beyza")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi){
        println("${o.no} -> ${o.ad}")
    }

    //Sıralama - Sorting
    println("Sayısal: Küçükten > Büyüğe")
    val s1 = ogrencilerListesi.sortedWith(compareBy{it.no})
    for (o in s1){
        println("${o.no} -> ${o.ad}")
    }

    println("Sayısal: Büyükten > Küçüğe")
    val s2 = ogrencilerListesi.sortedWith(compareByDescending{it.no})
    for (o in s2){
        println("${o.no} -> ${o.ad}")
    }
    println("Harfsel: Küçükten > Büyüğe") //Ascending : ASC
    val s3 = ogrencilerListesi.sortedWith(compareBy{it.ad})
    for (o in s3){
        println("${o.no} -> ${o.ad}")
    }

    println("Harfsel: Büyükten > Küçüğe") //DESC
    val s4 = ogrencilerListesi.sortedWith(compareByDescending{it.ad})
    for (o in s4){
        println("${o.no} -> ${o.ad}")
    }
    //Filtreleme
    println("Filtreleme 1")
    val f1= ogrencilerListesi.filter { it.no > 150 && it.no < 250}
    for (o in f1){
        println("${o.no} -> ${o.ad}")
    }
    println("Filtreleme 2")
    val f2= ogrencilerListesi.filter { it.ad.contains("yz")}
    for (o in f2){
        println("${o.no} -> ${o.ad}")
    }
}