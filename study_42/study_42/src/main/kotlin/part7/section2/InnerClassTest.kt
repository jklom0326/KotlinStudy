package part7.section2

class Smartphone(val model: String){
    private  val cpu = "Exynos"

    fun powerOn(): String{
        class  Led(val color: String){ // 지역 클래스 선언
            fun blink(): String = "Blinking $color on $model" // 외부 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red") // 여기에서 지역 클래스가 사용됨
        return powerStatus.blink()
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
