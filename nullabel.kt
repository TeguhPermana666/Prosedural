package com.dicoding.kotlin.prosedural
fun main(){
    val value :Int?= null
    println(value.slience)

    val nilai : Int?=null//safety operator
    println(nilai.fungsi)

    val aman : Int?=null
    println(aman?.fungsi2)
}
val Int?.slience:Int
    get() = this ?.div(2) ?:0

val Int?.fungsi:Int
    get() = if (this == null) {
        0
    } else {
        this.div(10)
    }

val Int.fungsi2:Int
get() = this.div(2)