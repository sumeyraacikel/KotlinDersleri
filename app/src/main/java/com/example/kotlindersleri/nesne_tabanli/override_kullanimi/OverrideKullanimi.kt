package com.example.kotlindersleri.nesne_tabanli.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()//Kalıtım yok, kendi metoduna erişti
    memeli.sesCikar()//Kalıtım var, üst sınıfın metoduna erişti
    kedi.sesCikar()//kalıtım var, kendi metoduna erişti
    kopek.sesCikar()//kalıtım var, kendi metoduna erişti
}