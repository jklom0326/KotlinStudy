package part7.section2

// 실드 클래스 선언 방법 첫번째 방법
sealed class Result{
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

class Status: Result()                  // 실드클래스 상속은 같은파일에서만 가능
class Inside: Result.Success("Status") // 내부클래스 상속

// 실드 클래스를 선언하는 두 번째 방법
//sealed class Result
//
//open class Success(val message: String): Result()
//class Error(val code: Int, val message: String): Result()

fun main() {
    //Success에 대한 객체 생성
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

fun eval(result: Result): String = when(result){
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}
