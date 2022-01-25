package com.dicoding.kotlin.prosedural
//higher order adalah menggunakan suatu fungsi sebagai keluaran untuk fungsi lainnya dimana fungsi keluaran yakni disini adalah lambda
fun main(){
    printresult(value=10, sum)
    //samhalnya dengan diatas dimana lambda expresion diletakan di luar
    printlamda(value=20){
        value->value+value//masuk ke sam
    }

}
fun printlamda(value: Int, sam: (Int) -> Int){
    val result = sam(value)
    println(result)
}
fun printresult(value :Int , sum:(Int)->Int){
    val result = sum(value)
    println(result)
}
var sum:(Int)->Int = {value ->value+value}