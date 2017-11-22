package Classes

class Person (var name:String){
    var age:Int=0
    init {
        println("Created person with name = $name")
    }

    constructor(name:String, age:Int) : this(name) {
        this.age = age
    }
}

class Foo{
    var x : Int get() {return x+1} set(value) {x = value}
}

// overriding implementation
open class A {
    open fun f() {print("A")}
    fun a() {print("a")}
}

interface B {
    fun f() {print("B")}
    fun b() {print("b")}
}

class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

fun main(args:Array<String>) {
    var person1 = Person("Meghaditya")
    println(person1.age)
    var person2 = Person("Abir", 27)
    println(person2.age)
}