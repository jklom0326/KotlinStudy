package com.example.jklom0326.chap07.section1.coffeeMaker

class CoffeeMaker(val coffeeModule: CoffeeModule) {
    fun brew(){
        val thermosiphon: Thermosiphon = coffeeModule.getThermosiphon()
        thermosiphon.on()
        thermosiphon.pump()
        println("Coffee, here! Enjoy!~")
        thermosiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}