package com.example.kotlindersleri.nesne_tabanli

fun main() {
    //Nesne oluşturma
        val bmw = Araba("Kırmızı", 0, false)

    //Değer okuma
    bmw.bilgiAl()

    //Değer atama
    bmw.hiz = 10
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(50)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz", 100, true)

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(30)
    sahin.bilgiAl()
    sahin.yavasla(10)
    sahin.bilgiAl()


}