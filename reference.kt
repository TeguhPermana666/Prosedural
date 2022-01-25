package com.dicoding.kotlin.prosedural
var message="HAI KOTLIN"//unmuntableproperty
fun main(){
    //fungsi reference
    val number = 1.rangeTo(10)
    val evennumber= number.filter(::evenfungsi)
    println(evennumber)
    //dengan extensions
    val numbers = 1.rangeTo(10)
    val genap= numbers.filter(Int::fungsigenap)
    println(genap)
    //fungsi property=>merubah ke mutbaleproperty
    println(::message.get())
    ::message.set("Hai ANJING")
    println(::message.get())
}
fun evenfungsi(number:Int)= number%2==0
fun Int.fungsigenap()=this%2==0