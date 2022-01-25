package com.dicoding.kotlin.prosedural

//extension function =>menggunakan receveir type dan object receiver

fun Int.hitung(){
    println("$this adalah value")
}

fun Int.hitung2():Int{
    return this + 3
}

//extension properti
val Int.variabel:Int
    get() = this /2
fun main(){
    10.hitung()//pemanggil extension function
    println(20.hitung2())
    println(20.variabel)
}
