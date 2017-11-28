package Coroutines

import kotlinx.coroutines.experimental.*

fun main (args:Array<String>) = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("I'm sleeping $i")
            delay(500L)
        }
    }
    delay(1000L)
    println("Man, I'm tired of waiting")
    job.cancelAndJoin()
}