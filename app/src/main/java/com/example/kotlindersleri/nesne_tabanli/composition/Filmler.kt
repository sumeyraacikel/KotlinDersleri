package com.example.kotlindersleri.nesne_tabanli.composition

 data class Filmler(var film_id:Int,
                    var film_ad:String,
                    var film_yil:Int,
                    var kategori: Kategoriler,
                    var yonetmen: Yonetmenler) {


}