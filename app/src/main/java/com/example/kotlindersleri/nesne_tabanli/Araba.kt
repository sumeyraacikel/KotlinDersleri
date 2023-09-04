package com.example.kotlindersleri.nesne_tabanli

class Araba (var renk:String, var hiz:Int, var calisiyorMu:Boolean) {//Constructor

    init {
        println("Nesne oluşturuldu")
    }
    fun calistir(){//Side effect, fonksiyonun etkisini değiştirir
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz+=kacKm//hiz = hiz + kacKm
    }

    fun yavasla(kacKm: Int){
       hiz-=kacKm //hiz = hiz - kacKm
    }
    fun bilgiAl(){
        println("-----------------")
        println("Renk         : ${renk}")
        println("Hız          : ${hiz}")
        println("Çalışıyor mu : ${calisiyorMu}")
    }

    //this : bulunduğu class
    //super : üst classtır(kalıtım)

}