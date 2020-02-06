package com.raj.kotlintutorial

class OverridingClass {

    fun functionOverride(){println("No Values")}
    fun functionOverride(value:Int){ println("Values are $value")}
    fun functionOverride(value:Int,valueString:String){println("Values are $value And $valueString")}
}