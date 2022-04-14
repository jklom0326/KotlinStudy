package com.example.jklom0326.chap07.section1.coffeeMaker

class ElectricHeater(var heating: Boolean = false) : Heater{
    override fun on() {
        println("[EletricHeater] heating.....")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean = heating
}