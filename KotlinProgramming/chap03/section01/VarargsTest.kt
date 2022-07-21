package com.example.jklom0326.chap03.section01

fun main(){
    normalVarargs(1,2,3,4)
    normalVarargs(4,6,5)
}

fun normalVarargs(vararg counts:Int){
    for(num in counts){
        print("$num")
    }
      print("\n")
}
