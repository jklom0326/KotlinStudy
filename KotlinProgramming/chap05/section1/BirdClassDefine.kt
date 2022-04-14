package com.example.jklom0326.chap05.section1

class Bird {
    var name: String = "MyBird"
    var wing: Int = 2
    var beak: String = "Short"
    var color: String = "Blue"

    fun fly()= println("Fly Wing : $wing")
    fun sing(vol: Int) = println("Sing Vol : $vol")

}

fun main() {
    val coco = Bird()
    coco.color = "Red"

    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(4)
}