package com.dicoding.kotlin.prosedural

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()//satu alamat
    stringBuilder.action()//memanggil atribut action
    return stringBuilder.toString()
}

/*
   output : Hello from lambda
*/