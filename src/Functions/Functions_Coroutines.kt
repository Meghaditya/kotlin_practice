package Functions

import kotlin.coroutines.experimental.SequenceBuilder
import kotlin.coroutines.experimental.buildSequence

val fibonacciSequence = buildSequence{
    var a = 0
    var b = 1

    yield(1)

    while (true) {
        yield(a + b)

        a += b
        b = a - b
        a -= b
        b += a
    }
}

val lazySequence = buildSequence {
    println("Start")
    for (i in 1..5) {
        yield(i)
        println("Step")
    }
    println("End")
}

val lazySeq = buildSequence {
    yield(0)
    yieldAll(1..10)
}

suspend fun SequenceBuilder<Int>.yieldIfOdd(x:Int) {
    if (x%2 != 0) yield(x)
}

val lazySeq1 = buildSequence {
    for (i in 1..10) {
        yieldIfOdd(i)
    }
}

fun main(args:Array<String>) {
    //println(fibonacciSequence.take(18).toList())
    //lazySequence.take(3).forEach { println("$it") }
    //lazySeq.forEach { println("$it") }
    lazySeq1.forEach { println("$it") }
}