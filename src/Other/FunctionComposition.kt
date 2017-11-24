package Other

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B) : (A) -> C {
    return {x -> f(g(x))}
}

fun length(s:String) = s.length
fun isOdd(l:Int) = l%2 != 0

fun main(args:Array<String>) {
    val oddLength = compose(::isOdd, ::length)
    val stringList = listOf("a", "ab", "abc")

    println(stringList.filter(oddLength))
}