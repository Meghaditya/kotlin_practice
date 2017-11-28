package Coroutines

import kotlinx.coroutines.experimental.*

fun main(args:Array<String>) = runBlocking {
    val job = launch {
        doWorld()
    }
    println("Hello,")
    job.join()
}

private suspend fun doWorld() {
    delay(1000L)
    println("World!")
}