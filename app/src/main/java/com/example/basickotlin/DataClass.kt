package com.example.basickotlin

//Data class
//Data class adalah class yang digunakan untuk menyimpan dana
//data class menyediakan fungsi untuk me-override fungsi equals(), hashCode(), dan toString()
//Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1,"rohman@gmail.com")
    println(data)

    //fungsi equals
    val data2 = DataClass(2,"makan@gmail.com")
    println(data == data2) //false

    //fungsi copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email = "sahara@umy.id")
    println(data4)

    println()
    println(data)
    println(data2)
    println(data3)
    println(data4)
}