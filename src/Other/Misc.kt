package Other

import GettingStarted.list

data class Counter(private val dayIndex:Int) {
    operator fun plus(increment:Int) : Counter {
        return Counter(dayIndex + increment)
    }
}

fun main(args:Array<String>) {
    println((1..100 step 5).last)

    val x = intArrayOf(1,2,3)
    when(x){
        is IntArray -> println("Sum of x is ${x.sum()}")
    }

    var counter = Counter(5);
    counter+=3;
    println("Counter object is : $counter")

    val nullableList: List<Int?> = listOf(1,2,null,4)
    val intList = nullableList.filterNotNull()
    println(intList)

    val x1 = null
    val l1 = listOf(null)
    when(x1) {
        is Nothing? -> println("yes")
    }
}