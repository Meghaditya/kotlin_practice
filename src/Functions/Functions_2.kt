package Functions

fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean) : T? {
    var max: T? = null
    for (it in collection) {
        if (max == null || less(max, it)) {
            max = it
        }
    }
    return max
}

fun main(args:Array<String>) {
    var strings = arrayOf("Pakistan", "India", "Bangladesh")
    // operation 1
    strings.sortBy { it }
    strings.forEach { println(it) }

    // operation 2
    strings.map {  }

    // function as a type and lambda expression
    var list = arrayListOf<Int>(1,2,3)
    val less : (Int, Int) -> Boolean = {x,y -> x<y}
    println(max(list, less))

    val list1 = arrayOf(-3,-4,2,3,-1)
    list1.filter { it>0 }
    list1.forEach { println(it) }

    var sum = 0
    list1.filter { it>0 }.forEach { sum += it }
    println(sum)

    // Function literals with receiver
    val sumFun = fun Int.(Other:Int): Int = this + Other
    println(100.sumFun(200))

    val represents: String.(Int) -> Boolean = {other -> toIntOrNull() == other}
    println("123".represents(123))

    fun testOperation(op:(String, Int) -> Boolean, a:String, b:Int, c:Boolean) =
            assert(op(a,b) == c)
    testOperation(represents, "100", 100, true)
}