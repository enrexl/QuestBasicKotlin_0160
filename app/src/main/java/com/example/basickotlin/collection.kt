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

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan set0f
// Set Mutable menggunakan mutableSet0f

fun contohSet(){
    println("====== SET ======")

    // readonly
    val readOnlyAbjad = listOf('A','B','C')
    println(readOnlyAbjad)

    // Mutable (R/W)
    val shape: MutableSet<String> = mutableSetOf("Square", "Hexa", "Triangle")
    println(shape)

    //--Add to Mutable list 'shape'
    shape.add("Circle")
    println(shape)

    //--Remove from Mutale list 'shape'
    shape.remove("Hexa")
    println(shape)

    // Mengambil string 'shape' dan menjadikannya readonly
    val shapesLock: Set<String> = shape
    println(shapesLock)
}


fun main(){
    contohList()
    contohSet()
}