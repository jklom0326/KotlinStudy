package com.example.jklom0326.chap05.section2.init

class Bird(var name: String, var wing: Int, var beak: String, var color: String){

    init {
        println("-----------초기화 블록 시작 --------------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("-----------초기화 블록 끝 ----------------")
    }
    fun fly() = println("Fly Wing: $wing")
    fun sing(vol: Int)= println("Sing Vol : $vol")
}

fun main() {
    val coco = Bird("MyBird",2,"Long","Red")
    coco.color = "Yellow"
    println("coco.color : ${coco.color}")
    coco.fly()

}