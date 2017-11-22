package Basics

fun main(args:Array<String>){
    var number = 12
    var validNumbers = intArrayOf(12,13,14)
    when(number){
        in 1..10 -> println("In between 1 and 10")
        in validNumbers -> println("Number is valid")
        else -> println("Number is unknown")
    }
}