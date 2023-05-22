package part7.section2

interface Switcher{ // 1. 인터페이스의 선언
    fun on() : String
}

class Smartphone(val model: String){
    private  val cpu = "Exynos"

    fun powerOn(): String{
        class  Led(val color: String){
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher{ // 2. 익명 객체를 사용해 Switcher의 on()을 구현
            override fun on(): String{
                return powerStatus.blink()
            }
        } // 익명(object) 객체 블록의 끝
        return powerSwitch.on() // 익명 객체의 메서드 사용
    }

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