package com.example.kotlindersleri.nesne_tabanli

fun main() {

    val a = Odev2()

    val gelenSonuc = a.soru1(10.00)
    println("Fahrenheit: $gelenSonuc")

    val Sonuc = a.soru2(5,4)
    println("Üçgenin çevresi: $Sonuc")

    val icAcilarToplami = a.soru3(4)
    println("İç açılar toplamı: $icAcilarToplami dır.")

    val maas = a.soru4(20,30)
    println("Maaş: $maas ₺")

    val kota = a.soru5(100, 5)
    println("İnternet ücreti : $kota ₺")

    val faktoriyel = a.soru6(5)
    println("Faktoriyel : $faktoriyel")

    val kelime = a.soru7("Sümeyraaa")
    println("Girilen kelime de bulunan 'a' harfi sayısı: $kelime")
}