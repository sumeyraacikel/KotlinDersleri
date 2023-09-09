package com.example.kotlindersleri.nesne_tabanli

class Odev2 {
    fun soru1(C:Double) : Double{
      val F=C*1.8+32
        return F
    }

    fun soru2(a:Int, b:Int) : Int {
        val sonuc = (2*a) + (2*b)
        return sonuc
    }

    fun soru3(kenarSayisi: Int) : Int {
        val icAcilarToplami = (kenarSayisi-2) * 180
        return icAcilarToplami
    }

    fun soru4(gunSayisi: Int, mesaiSaati: Int) :Int {
        val maasHesabi = (gunSayisi*8*10) + (mesaiSaati * 20)
        return maasHesabi
    }

    fun soru5(kota: Int, kotaAsimi: Int) : Int {
        val ucret = (kota * 2) + (kotaAsimi * 4)
        return ucret
    }

    fun soru6(sayi: Int):Int{
        var sonuc = 1

        for ( i in 1..sayi){
            sonuc *=i
        }
        return sonuc
    }
    fun soru7(kelime: String) : Int {
        var aSayisi = 0

        for (harf in kelime) {
            if (harf == 'a') {
                aSayisi++
            }
        }
        return aSayisi
    }


}