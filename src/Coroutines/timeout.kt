package Coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.withTimeout
import kotlinx.coroutines.experimental.withTimeoutOrNull

fun main(args:Array<String>) = runBlocking {
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i ->
            println("I am sleeping $i")
            delay(500L)
        }
    }
    println("Result is $result")
}