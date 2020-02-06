package com.raj.kotlintutorial


fun main() {

    println("////////////////////////Overriding////////////////////////////////")

    var mOverridingClass=OverridingClass()
    mOverridingClass.functionOverride()
    mOverridingClass.functionOverride(1)
    mOverridingClass.functionOverride(2,"String")


    println("////////////////////////OverLoading////////////////////////////////")

    var mOverLoadingClassParent=OverLoadingClassParent()
    mOverLoadingClassParent.overloadFunction()

}