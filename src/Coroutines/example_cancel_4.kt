package Coroutines

import kotlinx.coroutines.experimental.*

fun main(args:Array<String>) = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I am sleeping at $i")
                delay(500L)
            }
        } finally {
            run(NonCancellable) {
                println("I am running finally")
                delay(1000L)
                println("I've just delayed for 1 sec because I'm non-cancellable")
            }
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit")
}