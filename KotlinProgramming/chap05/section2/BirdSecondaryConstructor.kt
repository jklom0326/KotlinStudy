package com.example.jklom0326.chap05.section2.secondary

import javax.swing.WindowConstants

class Bird{
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color= color
    }
    fun fly() = println("Fly Wing : $wing")
    fun sing(vol: Int)= println("Sing Vol: $vol")
}

fun main() {
    val coco = Bird("MyBird",2,"Short","yellow")
    coco.color = "blue"
    println("coco.color: ${coco.color} ")
    coco.fly()
    coco.sing(7)
}