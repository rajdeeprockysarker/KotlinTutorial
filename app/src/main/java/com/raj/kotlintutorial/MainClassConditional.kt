package com.raj.kotlintutorial


fun main() {

    val testBoolean=false

    if (testBoolean)
        println("True")
    else
        println("False")


    var intVal=0
    val message=when(intVal){
        0-> "Value is $intVal"
        else-> "Value is something else"
    }
    println(message)
}
