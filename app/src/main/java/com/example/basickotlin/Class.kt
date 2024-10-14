package com.example.basickotlin

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")


//Print line value dalam properti 'email'
    println(contact.email)

//Update value didalam property 'email'
    contact.email = "Jane@Gmail.com"

//Print line value baru dalam properti 'email'
    println(contact.email)
}