package com.example.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Sümeyra" //white space
    var ogrenciYas = 25
    var ogrenciBoy = 1.57
    var ogrenciBasharf = 'S'
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)

    var urun_id:Int = 3232
    var urun_adi:String = "Macbook PRo"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 34555.2
    var urun_tedarikci:String = "Apple"

    println("Ürün id : $urun_id")
    println("Ürün adı : $urun_adi")
    println("Ürün adet : $urun_adet")
    println("Ürün fiyat : $urun_fiyat ₺")
    println("Ürün tedarikçi : $urun_tedarikci")

    var a = 10
    var b = 20

    println("$a x $b : ${a*b}")

    //Sabitler -Constant
    //java da final
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 90
    println(numara)
    //numara = 100

}