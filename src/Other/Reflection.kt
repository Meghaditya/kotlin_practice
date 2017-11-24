package Other

class A (val p:Int)
class Foo1

val String.lastChar:Char
    get() = this[length-1]

fun function(factory: ()->Foo1) {
    val x:Foo1 = factory()
}

fun main(args:Array<String>) {
    val prop = A::p
    println(prop.get(A(1)))
    println(String::lastChar.get("abc"))
    function(::Foo1)

    val numberRegex = "\\d+".toRegex()
    println(numberRegex.matches("24"))
    val isNumber = numberRegex::matches
    println(isNumber("a"))
    val strings = listOf("24", "def", "ghi")
    println(strings.filter(isNumber))
}