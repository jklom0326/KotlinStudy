package com.example.jklom0326.chap07.section2

interface Switcher{
    fun on() : String
}


class Smartphone(val model: String){
    private  val cpu = "Exynos"

    fun powerOn(): String{
        class  Led(val color: String){
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher{
            override fun on(): String{
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    } // powerOn() 블록 끝

    inner class ExternalStoreage(val size: Int){
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }
}

fun main() {
    val mySdcard = Smartphone("S8").ExternalStoreage(32)
    println(mySdcard.getInfo())
    val myphone = Smartphone("Note9")
    myphone.ExternalStoreage(128)
    println(myphone.powerOn())
}