package com.example.basickotlin

//Lambda Function
//Lambda funtions adalah fungsi yang tidak memiliki nama
//Lambda function biasanya digunakan untuk membuat fungsi yang senderhana
//Lambda functions menggunakan tanda pana (->) untuk memisahkan parameter dan body fungsi

fun toUppercase(string : String) : String{
    return string.uppercase()
}

//dapat ditulis dalam expressi lamba sbb:
fun main(){
    toUppercase("uhuy")
    println({string:String -> string.uppercase()} ("uhuy"))
    //UHUY
}