package com.raj.kotlintutorial

import android.util.Log

fun main() {

    val mEncapsulationClass=EncapsulationClass()
    mEncapsulationClass.getArrayListObject().add("1")
    mEncapsulationClass.getArrayListObject().add("2")

    for(i in 0..mEncapsulationClass.getArrayListObject().size-1){
        println(mEncapsulationClass.getArrayListObject()[i])
    }

}