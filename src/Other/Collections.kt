package Other

val numbers:MutableList<Int> = mutableListOf(1,2,3)
val readonlyView:List<Int> = numbers
val readWriteMap = hashMapOf("India" to 91, "US" to 1)
val readOnlyMap = HashMap(readWriteMap)

fun main(args:Array<String>) {
    println(numbers)
    numbers.add(4)
    println(readonlyView)

    readWriteMap["Belgium"] = 32
    println(readWriteMap)
    println(readOnlyMap)

    val items = listOf(1,2,3,4,5)
    items.filter { it>2 }
}