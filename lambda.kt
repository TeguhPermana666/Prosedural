package com.dicoding.kotlin.prosedural

fun main(){
    messageleght("HAI")
    val tampung=lambda1("hello return")
    println(":$tampung")
}
val messageleght={message:String -> println(message)}

val lambda1:(String)->String={message :String -> message.length.toString() }
