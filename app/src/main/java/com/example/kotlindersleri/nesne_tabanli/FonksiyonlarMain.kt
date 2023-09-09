package com.example.kotlindersleri.nesne_tabanli

fun main(){
    val f = Fonksiyonlar()

    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen sonuc : $gelenSonuc")

    f.selamla3("zeynep")

    val gelenToplam = f.toplama(10,20)
      println("Gelen toplam : $gelenToplam")

    f.carpma(5,3, "ZEynep")

    val sonuc= 6 carpi 3
    println(sonuc)

}

//Extension
   infix fun Int.carpi(sayi: Int) : Int {
        return this * sayi
    }