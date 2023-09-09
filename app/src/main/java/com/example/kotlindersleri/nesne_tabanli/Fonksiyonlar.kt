package com.example.kotlindersleri.nesne_tabanli

class Fonksiyonlar {
    //void : geri dönüş değeri olmayan
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return : geri dönüş değeri olan
    fun selamla2() : String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }
    //parametre : dışarıdan veri alan
    fun selamla3(isim: String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(sayi1: Int, sayi2:Int) : Int {
        val toplam = sayi1 + sayi2
        return toplam
    }

    //Overloading
    fun carpma(sayi1: Int, sayi2:Int) {
      println("Carpma : ${sayi1 * sayi2}")
    }

    fun carpma(sayi1: Int, sayi2:Int, isim: String) {
        println("Carpma : ${sayi1 * sayi2} - İşlem yapan : $isim")
    }


}