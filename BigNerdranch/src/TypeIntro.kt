package Part02

fun main() {
    val playerName = "에스트라곤"
    var experiencePoints =5
    var hasSteed= false
    var pubName = "유니콘의 뿔"
    var publicanName = ""
    var gold = 50
    val drink = listOf<String>("벌꿀주","포도주","라크루아")
    experiencePoints+=5
    println(experiencePoints)
    println(playerName)
    println(drink)
    publicanName = "김용"
    if(!hasSteed)
        println("유저가 아직 획득하지 못하였습니다")
    println(playerName.reversed())
}