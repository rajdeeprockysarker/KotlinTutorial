package com.raj.kotlintutorial


fun main() {

    var increment: Int = 0

    val mVariableClassKotlin = VariableClassKotlin()

    for (i in 0..10 step 2)
        mVariableClassKotlin.arrayValue[increment++] = i.toDouble()

    for (j in 0..mVariableClassKotlin.arrayValue.size - 1)
        println(mVariableClassKotlin.arrayValue[j])

    println("///////////////////////////////////////////////////////")

    mVariableClassKotlin.arayListVal.add("A")
    mVariableClassKotlin.arayListVal.add("B")
    mVariableClassKotlin.arayListVal.add("C")


    for (i in 0..mVariableClassKotlin.arayListVal.size-1)
        println(mVariableClassKotlin.arayListVal.get(i))

    println("///////////////////////CompanionObjectClass////////////////////////////////")
    ///////////////// Companion Object initialize when class is loaded
    var mgetObjectValue=CompanionObjectClass.getObjectValue
    println(mgetObjectValue.intValue)

    println("///////////////////////ObjectClass////////////////////////////////")
    ///////////////// Object call while access only
    println(ObjectClass.intValue)
}





