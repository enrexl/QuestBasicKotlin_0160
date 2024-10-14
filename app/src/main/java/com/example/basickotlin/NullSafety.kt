package com.example.basickotlin

fun nullSafety(){
    //nevernull itu string type
    var neverNull: String = "This can't be null!"

    //throws a compiler error
    //neverNull = null

    //nullable has NULLABLE STRING type
    var nullable: String? ="You can keep NULL here."
    //this is OK
    nullable = null



    //check for null in conditions
    if (neverNull == null){
        println("inferredNonNull in null")
    }
    else {
        println("inferredNonNull is not null")
    }

    //safe call operator
    println(neverNull.length) //19
    println(nullable?.length) //null

    //notnull tidak menerima null values
    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull)) //19
}

fun main(){
    nullSafety()
}