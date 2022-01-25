package com.dicoding.kotlin.prosedural

import java.lang.IllegalArgumentException

fun main(){
     val nilai=sum(10,20,30)
    println(nilai);


}

fun sum(ValueA:Int , ValueB:Int, ValueC:Int):Int{
    fun validnum(value:Int){
        if(value==0){
            throw IllegalArgumentException("value most than 0 bro")
        }
    }
    fun Int.validd(){
        if(this==0){
            throw IllegalArgumentException("value most than 000 bro")
        }
    }
    validnum(ValueA)
    validnum(ValueB)
    validnum(ValueC)

    ValueA.validd()
    ValueB.validd()
    ValueC.validd()

    return ValueA+ValueB+ValueC
}