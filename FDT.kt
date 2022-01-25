package com.dicoding.kotlin.prosedural

fun main(){
    //fold=>mengakses data dengan current dan item dimana
        //=>memudahkan menghitung item pada collection tanpa itteratio

    // current merepresentasikan sebuah nilai awal
    //item merepresentasikan nilai pada index variabel (atribut)

    println("Fload Normal")
    var numbers = listOf(1,2,3,4,5)
    val fold = numbers.fold(10){ current,item->
        println("current $current")
        println("item $item")
        println()
        return@fold current+item//return ke fold nya
        //atau current + item karena sudah otomatis dia return ke fold
    }
    println("result fload =$fold ")
    println("Fload Right")

    val foldright = numbers.foldRight(10){item,current ->
        println("current $current")
        println("item $item")
        println()
        return@foldRight item+current
    }
    println("result foldRight $foldright")


    println()

    println("Drop")
    //drop adalah memangkas nilai yang sudah ditetapkan pada collection
    val drop = numbers.drop(3)
    println(drop)

    val dropright= numbers.dropLast(3)
    println(dropright)
    println()
    //take adalah mengambil nilai yang sudah ditetapkan pada collection
     println("Take")
    val take = numbers.take(3)
    println(take)

    val taklast = numbers.takeLast(3)
    println(taklast)

}