fun main(args: Array<String>) {

//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2020
//        println("$numBuildings 채의 건물이 추가됨")
//        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
//    }
////    println(greetingFunction("zial",2))
//    runSimulation("zial", ::printConstructionCost) { playerName, numBuildings ->
//        val currentYear = 2020
//        println("$numBuildings 채의 건물이 추가됨")
//        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
//    }
    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("김선달"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "병원"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2020
        numBuildings += 1
        println("$numBuildings 채의 $structureType 이 추가됨")
        "SimVillage 방문을 환영합니다. $playerName 님 (copyright $currentYear)"
    }
}

//inline fun runSimulation(playerName: String,
//                         costPrinter: (Int) -> Unit,
//                         greetingFunction: (String, Int) -> String) {
//    val numBuildings = (1..3).shuffled().last()
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName, numBuildings))
//}

//fun printConstructionCost(numBuildings: Int) {
//    val cost = 500
//    println("건축 비용: ${cost * numBuildings}")
//}