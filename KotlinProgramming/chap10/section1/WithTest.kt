package com.example.jklom0326.chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("kildong", "defualt")

    val result = with(user){
        skills = "Kotiln"
        email = "kildong@example.com"
    }
    println(user)
    println("result: $result")
}