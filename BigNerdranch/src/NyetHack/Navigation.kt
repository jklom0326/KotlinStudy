package NyetHack

enum class Direction(private val coordinate: Coordinate) {
    NORTH(Coordinate(0, -1)),
    EAST(Coordinate(1, 0)),
    SOUTH(Coordinate(0, 1)),
    WEST(Coordinate(-1, 0));
    // 위에 enum 클래스를 정의할 때, 마지막 항목의 제일 끝에 세미콜론을 붙여야 한다.

    fun updateCoordinate(playerCoordinate: Coordinate) = coordinate + playerCoordinate
}

data class Coordinate(val x: Int, val y: Int) {
    val isInBounds = x >= 0 && y >= 0

    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}