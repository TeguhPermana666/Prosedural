package com.dicoding.kotlin.prosedural
//this
fun main(){
    //run =>mengembalikan nilai sesuai expresion dalam lambda,digunakan
    //untuk inisialisasi object dan perhitungan untuk nilai kembalian
    val message="hello"
    val result = message.run{
        val from=this
        val to = this.replace("hello","Sayang")
        "Nilai dari $from dirubah ke $to"
    }
    println (result)
    //with=>konteks objectnya disematkan menjadi argument dan dari blok lambda diakses sebagai receiver
    val result2= with(message){
        println("pesan adalah $this")
        println("dengan lebar ${this.length}")
    }
    println(result2)
    //or
    val result3 = with(message){
        "message pertama adalah ${this[0]}" +
            " and message terakhir adalah ${this[this.length-1]} "
    }
    println(result3)
    //apply digunakan utnuk nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver
    //dapat melakukan inisialisasi atau konfigurasi dari receivernya
    val result4 = StringBuilder().apply {
        append("Hello teguh")
        append("\n SUKSUMA")
    }
    println(result4)
    println(result4.toString())

    //tanpa receiver
    val result5= StringBuilder()
    result5.append("Hello")
    result5.append(" TEGUH")
    println(result5)
}