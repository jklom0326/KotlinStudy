package com.example.jklom0326.chap06.section2

interface Car {
    fun go(): String
}

class VanImpl(val power: String): Car {
    override fun go() ="은 짐을 적재하며 $power 을 가집니다."
}
class SportImpl(val power: String): Car{
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다."
}

class CarModel(val model: String, impl: Car): Car by impl{
    fun carInfo(){
        println("$model ${go()}") //(1) 참조없이 각 인터페이스 구현 클래스의 go를 구현
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350z 2008", SportImpl("350마력"))

    myDamas.carInfo() // (2) carInfo에 대한 다형성을 나타냄
    my350z.carInfo()
}