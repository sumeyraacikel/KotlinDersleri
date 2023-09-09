package com.example.kotlindersleri.nesne_tabanli

class ClassA : MyInterface {
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod1 çalıştı")
    }

    override fun metod2(): String {
        return "Metod2 çalıştı"
    }
}