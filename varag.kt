package com.dicoding.kotlin.prosedural

fun main(){
    val nilai=hitung(10,20,30,40,50,60)
    //mendeklarasikan berbagai macam nilai dlm satu tipe data dikelompokan jadi satu
    println(nilai)
    //varag layaknya array yg menampung ke variabel coba disandingkan dengan array
    val AsList=asList(10,20,30,40,50,60)
    println(AsList)

    val campurt= campur(10,20,30,Nama = "Array")

    println(campurt.toString())

    //val array= arrayOf(1,2,3,4,5)
    //babi(1,2,3,4,5,6,*array)
}

fun hitung (vararg nilai :Int):Int{
    return nilai.sum()
}
//varag dengan generic, secara dasarnya varag menampung array < out T>
fun <T> asList(vararg input: T): List<T> {//input berisikan nilai nilai
    val result = ArrayList<T>()//result dibentuk menjadi ArrayList =>list
    for (item in input){//item sebagai pergeraknya
        result.add(item)//penambahan operator jika sudah menjadu muttable tipe arraynya
    }
    return result//result dalam bentuk list
}

fun campur(vararg nilai : Int, Nama :String):IntArray {
    println("$Nama:\n")
    return nilai
}

/*fun babi (vararg Number:Int){
    println(Number)
}*/