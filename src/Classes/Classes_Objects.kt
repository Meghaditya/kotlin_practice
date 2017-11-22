package Classes

import kotlin.properties.Delegates

open class A1(x:Int) {
    open val y : Int = x
}

fun foo() {
    val adHoc = object {
        var x : Int = 4
        var y : Int = 5
    }
    println(adHoc.x + adHoc.y)
}

// Companion object
class MyClass {
    companion object {
        var x : Int = 6
    }
}

interface Base {
    fun print()
}

class BaseImpl(val x:Int) : Base {
    override fun print() {
        print("Base-")
        print(x)
    }
}

class Derived(b: Base) : Base by b {
    override fun print() {
        print("Derived-")
    }
}

class User {
    var name:String by Delegates.observable("<no value>") {
        prop, old, new -> println("$old -> $new")
    }
    var lastName:String by Delegates.vetoable("<no value>") {
        prop, old, new ->
        if (new.startsWith("A")) {
            println("$old -> $new")
            true
        } else {
            println("Invalid assignment")
            false
        }
    }
}

class MapUser (map:Map<String, Any?>) {
    val name:String by map
    val age:Int by map
}

fun main(args:Array<String>) {
    foo()
    val ab : A1 = object : A1(1) {
    }
    println(ab.y)
    println(MyClass.x)

    val b = BaseImpl(10)
    Derived(b).print()

    // Delegation
    val user = User()
    user.name="Meghaditya"
    user.lastName="Roy"
    print(user.lastName)

    val mapUser = MapUser(mapOf("name" to "Meghaditya", "age" to 27))
    println(mapUser.name + " " + mapUser.age)
}