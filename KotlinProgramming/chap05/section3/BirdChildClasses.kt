package com.example.jklom0326.chap05.section3.openclasses

// (1) 상속 가능한 클래스를 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String){
    //메서드
    fun fly()= println("Fly wing: $wing")
    fun sing(vol: Int)= println("sing vol : $vol")
}
//  (2) 주 생성자를 사용하는 상속
class  Lark(name:String,wing: Int,beak: String, color: String) : Bird(name,wing,beak,color){
    fun singHitone() = println("Happy Song!") // 추가된 매서드
}
//(3) 부 생성자를 사용하는 상속
class Parrot : Bird{
    val language: String

    constructor(name : String,wing: Int,beak: String,color: String, language: String) : super(name,wing,beak,color){
        this.language=language // 새로 추가된 프로퍼티
    }
    fun speak() = println("Speak $language")
}

fun main() {
    val coco = Bird("MyBird",2,"Short","blue")
    val lark = Lark("MyLark",2,"Long","Grey")
    val parrot = Parrot("MyParrot",2,"Long","Yellow","Korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color},${parrot.language}")
    lark.singHitone()
    parrot.speak()
    lark.fly()
}
