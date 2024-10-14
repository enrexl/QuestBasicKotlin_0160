package com.example.basickotlin

//ConditionalExpression adalah expresi yang mengembalkan nilai berdasarkan kondisi tertentu
//ContiionalExpression menggunakan if-else, when, dan try-catch

fun conditionalStatement(){
    println("== Conditional Expression==")

    //if-else
    val number = 10
    if (number>0){
        println("Positive Number")
    }
    else{
        println("Negative Number")
    }

    //when
    val day = 1
    when(day) {
        1 ->  println("Monday")
        2 ->  println("Tuesday")
        3 ->  println("Wednesday")
        4 ->  println("Thrusday")
        5 ->  println("Payday")
        6 ->  println("Saturday")
        7 ->  println("Holiday")
        else->println("Invalid")
    }

    //Try - Catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    }
    catch (e: NumberFormatException){
        println("Invalid Number")
    }
}

fun perulangan(){
    println("== Perulangan ==")

    for (i in 1..5){
        println("Perulangan ke - $i")
    }

    val mobil = listOf("Toyota","BMW","Porsche")
    for (car in mobil){
        println("Merk Mobil $car")
    }

    var x =1
    while (x<=5){
        println("Nomor ke-$x")
        x++
    }

    var y =1
    do{
        println("Urutan ke-$y")
        y++
    }
        while (y<=5)

}

fun main(){
    conditionalStatement()
    perulangan()
}