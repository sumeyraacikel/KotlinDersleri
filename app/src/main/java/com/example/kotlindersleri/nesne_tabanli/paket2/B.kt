package com.example.kotlindersleri.nesne_tabanli.paket2

import com.example.kotlindersleri.nesne_tabanli.paket1.A

class B : A() {
    fun metod(){
        //val a = A()

        println(publicDegisken)
        println(varsayilanDegisken)
        println(protectedDegisken)
    }
}