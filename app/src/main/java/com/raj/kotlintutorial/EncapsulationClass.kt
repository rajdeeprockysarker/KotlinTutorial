package com.raj.kotlintutorial

class EncapsulationClass(){
    private var arrayListObject=ArrayList<String>()

    fun getArrayListObject(): ArrayList<String> {
        return arrayListObject
    }
}
