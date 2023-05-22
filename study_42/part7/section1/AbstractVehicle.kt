package part7.section1

// 추상클래스, 주생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음
abstract class Vehicle(val name: String,val color: String, val weight: Double){
    // 추상프로퍼티(반드시 하위클래스에서 재정의해 초기화 해야함)
    abstract var maxSpeed: Double

    //일반 프로퍼티 (초깃값인 상태를 저장할 수 있음)
    var year = "2020"

    // 추상메서드 (반드시 하위클래스에서 구현해야함)

    abstract fun start()
    abstract fun stop()

    //일반 메서드
    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight,Year: $year, MaxSpeed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }
}

class Motocycle(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        println("Motocycle Started")
    }

    override fun stop() {
        println("Motocycle Stopped")
    }
}

fun main() {
    val car = Car("Macerati","Yellow",123141.0,554.53)
    val motor = Motocycle("Yamaha","Grey",404.0,100.0)

    car.year = "2018"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.stop()
}