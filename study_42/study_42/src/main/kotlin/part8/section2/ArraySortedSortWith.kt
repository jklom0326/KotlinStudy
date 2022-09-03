package part8.section2.sortwith

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball",870.00),
        Product("Smart Phone A",999.00),
        Product("Drone",240.00),
        Product("Mouse",333.55),
        Product("KeyBoard",125.99),
        Product("Smart Phone B",1500.99),
        Product("Mouse",512.99))

    products.sortWith(// comparator를 이용해 두 객체를 비교, p1이 크면 1 같으면 0 작으면 -1
        Comparator<Product>{p1,p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    products.forEach { println(it) }
    println()
    products.sortWith(compareBy({it.name},{it.price}))
    println()
    products.forEach { println(it) }
}

