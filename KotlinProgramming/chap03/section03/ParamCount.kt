package com.example.jklom0326.chap03.section03

fun main(){
    //매개변수가 없는 람다식
    noParam ({  "Hello World!"})
    noParam {  "Hello World!"}
}

fun noParam(out: ()->String) = println(out())