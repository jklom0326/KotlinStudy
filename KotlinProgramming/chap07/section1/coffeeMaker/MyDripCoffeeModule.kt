package com.example.jklom0326.chap07.section1.coffeeMaker

class MyDripCoffeeModule : CoffeeModule {
    companion object{
        val electricHeater: ElectricHeater by lazy {
            ElectricHeater()
        }
    }
    private val _thermosiphon : Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }
    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}

