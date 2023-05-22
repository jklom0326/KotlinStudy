package kidinterface

interface Vehicle {

    val currentSpeed: Int

    val isMoving get() = currentSpeed != 0

    fun move()
    fun stop()

    fun report() {
        println(if (isMoving) "Moving at $currentSpeed" else "Still")
    }
}

interface FlyingVehicle : Vehicle {
    val currentHeight: Int
    fun takeOff()
    fun land()
}

class Car : Vehicle {
    override var currentSpeed = 0
        private set

    override fun move() {
        println("Riding...")
        currentSpeed = 50
    }

    override fun stop() {
        println("Stopped")
        currentSpeed = 0
    }
}

class Aircrft : FlyingVehicle {
    override var currentHeight = 0
        private set
    override var currentSpeed = 0
        private set

    override fun takeOff() {
        println("Taking Off...")
        currentSpeed = 500
        currentHeight = 5000
    }

    override fun land() {
        println("Landed")
        currentSpeed = 50
        currentHeight = 0
    }

    override fun move() {
        println("Taxiing...")
        currentSpeed = 50
    }

    override fun stop() {
        println("Stopped")
        currentSpeed = 0
    }
}