package com.dicoding.kotlin.prosedural

fun main(){
    //named argument =>tidak usah menghafal sebuah argument yang ditetapkan
    val getvalue=fungsi(nama="nama",akhir = "akhir",no = 10 )
    println(getvalue)
    //parameter pass ke agument yang sudah terisi nilai di setiap argument ->canggih
    val getvalue2 = fungsi2()
    println(getvalue2)
}
//named argument
fun fungsi(nama :String, no :Int, akhir :String):String {//pass nya tetep posisi yg sama tanpa harus mengingat letak
    return "$nama $no $akhir"
}
//default argument
fun fungsi2(
    awal :String="TEGUH",
    tengah : Int=100,
    akhir:String="PERMANA GANS"
):String{
    return "$awal $tengah $akhir"
}
