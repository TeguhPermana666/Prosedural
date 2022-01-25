package com.dicoding.kotlin.prosedural

fun main(){
    //slice digunakan untuk menyaring sebuah data pada sebuah collections
    //slice membutuhkan sebuah range utnuk menyaring sebuah collections
    val collections = listOf(1,2,3,4,5,6,7,8,9,10)

    val saring = collections.slice(3..6)//tambahkan range yang akan di saring
    println(saring)

    //modifikasi kan slice pada rangenya hehe


    val saring2 = collections.slice(3..10 step 2)
    println(saring2)

    val index = listOf(1,2,3,4,5)

    val saring3 = collections.slice(index)
    println(saring3)

    //Distinct =>menyaring item yang sama pada collection

    val total = listOf(1,2,2,2,2,2,3,3,3,3,3,3,4,5)
    val distinct = total.distinct()
    println(distinct)

    //distinch used data class
    data class item (val key :String, val value : Any)
    val items = listOf(
        item("1","Kotlin"),
        item("2","kimoci"),
        item("3","asick"),
        //dibawah ga kebawa karena disaring 3 nya sama
        item("3", "Awesome"),
        item("3", "as"),
        item("3", "Programming"),
        item("3", "Language")
    )
    val distnichitems= items.distinctBy { it.key }
    distnichitems.forEach {
        println("${it.key} dengan value ${it.value}")
    }
    //chucked digunakan untuk memecah nilai string
    val nama = "teguh permana ganteng"
    val chucked = nama.chunked(2)
    println(chucked)
}