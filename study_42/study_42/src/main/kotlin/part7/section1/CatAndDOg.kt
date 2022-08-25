package part7.section1

open class Animal(val name: String)

//(1) feeding의 구현을 위해 이너페이스 Pet지정
class  Dog(name:String, override var category: String) : Animal(name),Pet{

    override var species: String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
//    fun playwithPet(dog: Dog){
//        println("Enjoy with my dog.")
//    }
//    fun playwithPet(cat: Cat){
//        println("Enjoy with my cat.")
//    }

    fun playwithPet(pet: Pet){
        println("Enjoy with my ${pet.species}")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Chanho","huge")
    val cat = Cat("inook","BigFat")
    master.playwithPet(dog)
    master.playwithPet(cat)

}