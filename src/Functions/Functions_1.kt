package Functions

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        // ts is an Array
        result.add(t)
    }
    return result
}

fun hasZeros(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0) return true // returns from hasZeros
    }
    return false
}

fun foo1(bar:Int = 0, baz:Int = 1, qux:()->Unit) {
    println("value of $bar and $baz. The fn is $qux")
}

tailrec fun findFixPoint(x:Double=1.0, fn:(Double)->Double):Double = if(x==fn(x)) x else findFixPoint(fn(x), fn)

fun main(args:Array<String>) {
    println(asList("A", "B", "C"))

    val a = arrayOf(4,5,6)

    println(asList(1, 2, 3, *a, 7, 8, 9))
    println(hasZeros(asList(0, 1, 2)))

    //println(findFixPoint(Math.cos))
}