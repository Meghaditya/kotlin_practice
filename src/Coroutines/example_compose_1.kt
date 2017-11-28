package Coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

suspend fun doSomethingUsefulOne() : Int {
    delay(500L)
    return 13
}

suspend fun doSomethingUsefulTwo() : Int {
    delay(500L)
    return 29
}

fun main(args:Array<String>) = runBlocking {
    val time = measureTimeMillis {
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
        println("The answer is ${one+two}")
    }
    println("Completed in $time ms")
}