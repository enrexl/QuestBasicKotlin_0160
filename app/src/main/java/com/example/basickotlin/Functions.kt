package com.example.basickotlin

fun withoutParameter(){
    println("=W/O=")
    println("Hello, World!")
}

fun withParameter(name: String){
    println()
    println("With Parameter")
    println("Good Morning $name!")
}

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter

fun withNamedArgument(name:String, age:Int){
    println()
    println("==NamedArgument==")
    println("Hello $name, You are $age years old")
}

//default parameter value
//defauly parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi

fun withDefaultParamtere(name: String = "Uhuy", age: Int){
    println()
    println("==With Default Parameter==")
    println("Hello $name, you are $age years old")
}

fun withReturn(panjang: Int = 0, lebar:Int =0) {
    println()
    println("Return")
    return println(panjang * lebar)
}

fun main(){
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 35)
    withDefaultParamtere(age = 33)
    withReturn(5,4)
}