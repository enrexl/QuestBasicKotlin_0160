package com.example.basickotlin

// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListof

fun contohList(){
    println("====== LIST ======")

    // readonly
    val readOnlyAbjad = listOf('A','B','C')
    println(readOnlyAbjad)

    // Mutable (R/W)
    val shape: MutableList<String> = mutableListOf("Square", "Hexa", "Triangle")
    println(shape)

    //--Add to Mutable list 'shape'
    shape.add("Circle")
    println(shape)

    //--Remove from Mutale list 'shape'
    shape.remove("Hexa")
    println(shape)

    //--Mengubah data dalam list mutable
    shape[0] = "Cylinder"
    println(shape)

    // Mengambil string 'shape' dan menjadikannya readonly
    val shapesLock: List<String> = shape
    println(shapesLock)

}

fun main(){
    contohList()
}