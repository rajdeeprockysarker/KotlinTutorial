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

    println( "///////////////// Normal for loop ///////////////////////////")
    ///////////////// Normal for loop ///////////////////////////
    for (i in 0..10 step 1){
        println(i)
    }
    println( "///////////////// DownTo for loop ///////////////////////////")
    ///////////////// Normal for loop ///////////////////////////
    for (i in 10 downTo 1 step 1){
        println(" "+i)
    }
}
