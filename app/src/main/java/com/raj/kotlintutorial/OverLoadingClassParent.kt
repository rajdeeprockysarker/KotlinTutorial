package com.raj.kotlintutorial

class OverLoadingClassParent :OverLoadingClassChildren(){
    override fun overloadFunction() {
        super.overloadFunction()
        print("I Parent Class");
    }
}