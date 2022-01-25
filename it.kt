package com.dicoding.kotlin.prosedural

fun main(){
    //let => menggunakan it untuk mengakses konteks digunakan untuk tipe penggunaan object non null
    val message:String?= null
    message?.let{
        val lenght = it.length*2
        val text = " text dengan panjang adalah $lenght"
        println(text)

    }
    val pesan :String?= null
    pesan?.let{
        val lenght = it.length
        val nilai ="text dengan panjang adalah $lenght"
        println(nilai)
    }

    val panjang= message?.length ?: 0
    println(panjang)

    val message2:String ?=null
    message2?.let{
        val lebar = it.length*2
        val text ="Lebar adalah $lebar"
        println(text)
    }?:run{
        val text="NULL bro"
        println(text)
    }
    //also
    val text="hello kotlin"
    val result=text.also {
        println("${it.length}")
    }
    println("$result")
}