package part5.section6

class Pond(_name: String, _members: MutableList<Duck>){
    val name: String = _name
    val mebers: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}
class Duck(val name: String)
    fun main(){
        val pond = Pond("MyFavorite")
        val duck1 = Duck("Duck1")
        val duck2 = Duck("Duck2")

        pond.mebers.add(duck1)
        pond.mebers.add(duck2)

        for (duck in pond.mebers){
            println(duck.name)
        }
    }