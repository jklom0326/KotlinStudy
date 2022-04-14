package com.example.jklom0326.chap03.section01

fun main(){
    val name = "엄준식"
    val email = "amumu@kakao.com"

    add(name)
    add(name,email)
    add("손인욱","pakacu@daum.pot")
    defaultArgs()
    defaultArgs(200)
}

fun add(name: String,email: String = "Default"){
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x:Int= 100, y:Int= 200){
    println(x+y)
}