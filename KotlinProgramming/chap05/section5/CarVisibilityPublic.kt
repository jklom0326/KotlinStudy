package com.example.jklom0326.chap05.section5

import java.io.BufferedReader

open class Car protected constructor(_year: Int, _model : String, _power: String, _wheel : String){

    private var year: Int = _year
    public var model: String = _model
    protected open var power: String = _power
    internal var wheel :String = _wheel

    protected fun start(Key: Boolean){
        if (Key) println("Start the Engine!")
    }
    class Driver(_name: String, _license: String){
        private var name: String = _name
        var license: String = _license
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String,var name: String,private  var key:Boolean) : Car(_year,_model,_power,_wheel){
    override var power: String="50hp"
    val driver = Driver(name,"First class")

    constructor(_name: String,_key: Boolean) : this(2014,"basic","100hp","normal",_name,_key){
        name = _name
        key = _key
    }
    fun access(password: String){
        if (password == "gotico"){
            println("----[Tico] access()---------")
            // super.year
            println("super.model = ${super.model}") // public
            println("super.power = ${super.power}") // protected
            println("super.wheel = ${super.wheel}") // internal
            super.start(key)

            //driver.name  // private 접근불가
            println("Driver().license = ${driver.license}")
            driver.driving()
        }else{
            println("You're a burglar")
        }
    }
}
class Buglar(){
    fun steal(anycar: Any){
        if (anycar is Tico){
            println("----[Buglar]steal()---------")
//            println(anycar.power)
//            println(anycar.year)
            println("anycar.name = ${anycar.name}")
            println("anycar.wheel = ${anycar.wheel}")
            println("anycar.model = ${anycar.model}")
            println(anycar.driver.license)
            anycar.driver.driving()
            //println(Car.start())
            anycar.access("dontknow")
        }else{
            println("Nothing to steal")
        }
    }
}

fun main() {
//    val car = Car()
    val tico = Tico("kildong",true)
    tico.access("gotico")

    val buglar = Buglar()
    buglar.steal(tico)
}