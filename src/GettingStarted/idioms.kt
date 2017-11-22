package GettingStarted

import jdk.jshell.spi.ExecutionControl.NotImplementedException

data class Customer (var name:String, var email:String)

fun String.spaceToCamelCase() {
    var charArray = this.toCharArray()
    var newString = ""
    var nextCap = true
    for (c in charArray) {
        if (nextCap) {
            newString += if (c.isWhitespace()) c else c.toUpperCase()
            nextCap = false
        } else {
            newString += c
        }
        if (c.isWhitespace()) {
            nextCap = true
        }
    }
    println(newString)
}

fun testException() : Unit = throw NotImplementedException("Not implemented")

fun gimmeArrayOfAllZeroes(size:Int):IntArray {
    return kotlin.IntArray(size).apply { fill(0) }
}

var list = listOf<Int>(1,4,67,34,210)

fun main(args: Array<String>) {
    val customer = Customer("Meghaditya", "meghaditya@wb.com")
    println(customer)
    customer.email = "meghaditya@karnakata.com"
    println(customer)

    "Test the hypothesis".spaceToCamelCase()

    // try-catch
    try {
        testException()
    } catch (e : NotImplementedException){
        println("Gotchha!")
    }

    gimmeArrayOfAllZeroes(5).forEach { print(it.toString() + ", ") }

    list.filter { it>10 }
            .map { element -> element*2 }
            .map {element -> print(element.toString() + ", ")}

    println("boxing test")
    val a:Int = 10000
    println(a==a)
    val boxedA:Int? = a
    val anotherboxedA:Int? = a
    println(boxedA == anotherboxedA)
}