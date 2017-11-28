package Coroutines

import kotlinx.coroutines.experimental.*

fun main(args:Array<String>) = runBlocking {
    val jobs = List(1_0) {
        launch {
            delay(1000L)
            print('.')
        }
    }
    jobs.forEach { it.join() }
}