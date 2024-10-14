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