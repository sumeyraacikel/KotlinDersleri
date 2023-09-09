package com.example.kotlindersleri.nesne_tabanli

fun main() {
    //Enumeration
    ucretHesapla(45,KonserveBoyut.ORTA)
}

fun ucretHesapla(adet: Int, boyut: KonserveBoyut){
    when (boyut){
        KonserveBoyut.KUCUK -> println("Ücret : ${adet*14} ₺")
        KonserveBoyut.ORTA  -> println("Ücret : ${adet*25} ₺")
        KonserveBoyut.BUYUK -> println("Ücret : ${adet*48} ₺")


    }
}