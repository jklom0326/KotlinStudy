package com.example.jklom0326.chap03.section01

fun main(){
    namedParam(x=50,z=400)
    namedParam(y= 300,z=400)
}
fun namedParam(x:Int = 100, y:Int = 200, z:Int){
    println(x+y+z)
}