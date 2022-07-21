import java.io.File

fun main() {
//    val menuFile = File("menu-file.txt")
//    menuFile.setReadable(true)
//    menuFile.setWritable(true)
//    menuFile.setExecutable(false)

    // 동일한 코드사용 제거 .apply적용하는방법
    val menuFile = File("menu-file.txt").apply {
        setReadable(true)       // 암시적으로 menuFile.setReadable(true)가 된다.
        setWritable(true)       // 암시적으로 menuFile.setWritable(true)가 된다.
        setExecutable(false)    // 암시적으로 menuFile.setExecutable(false)가 된다.
        // 람다 내부의 모든 함수 호출이 이제는 수신자에 관련되어 호출되므로
        // 연관범위(relative scoping)또는 수신자에 대한 암시적 호출(implictly called) 라고 한다
    }

    val firstItemSquared = listOf(1,2,3).first().let {
        it * it
    }

    //파일에 특정 문자열이 있는지 검사하는 코드
    val servesDragonsBreath = menuFile.run {
        readText().contains("Dragons's Breath")
    }


    fun nameIsLong(name: String) = name.length >= 20
    fun playerCreateMessage(nameTooLong: Boolean): String {
        return if (nameTooLong) {
            "Name is too long. Please choose another name."
        } else {
            "Welcom, adventurer"
        }
    }

    "Polarcubis, Supreme Master of NyeHack"
        .run(::nameIsLong)
        .run(::playerCreateMessage)
        .run(::println)

}