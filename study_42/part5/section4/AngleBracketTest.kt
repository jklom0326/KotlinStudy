package part5.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}
interface B{
    fun f() = println("B Interface f()") // 인터페이스는 기본적으로 open이다.
    fun b() = println("B Interface b()")
}
class C : A(), B { // 1. 콤마(,)를 사용해 클래스와 인터페이스를 지정
    // 컴파일되려면 f()가 오버라이딩 되어야한다.
    override fun f() = println("C Class f()")
    fun test(){
        f() // 2. 현재 클래스의 f()
        b() // 3. 인터페이스B의 b()
        super<A>.f() // 4. A클래스의 f()
        super<B>.f() // 5. B클래스의 f()
    }
}

fun main() {
    val c = C()
    c.test()
}