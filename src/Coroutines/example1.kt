package Coroutines

import kotlinx.coroutines.experimental.*

fun main(args:Array<String>) {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)
}