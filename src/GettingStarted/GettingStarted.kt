package GettingStarted

// simple function
fun sum(a:Int, b:Int) = a + b

// if-else expression
fun maxOf(a:Int, b:Int) = if (a>b) a else b

// automatic casting on conditional type check
fun getStringLength(x:Any) : Int = if (x is String && x.length > 0) x.length else 0

// GettingStarted.getList expression
val items = listOf<String>("Cristiano Ronaldo", "Lionel Messi", "Neymar")

// when expression
fun describe (x:Any) : String =
    when(x) {
        is Int -> "Integer"
        is Float -> "Float"
        is Double -> "Double"
        "Meghaditya" -> "Person"
        is String -> "String"
        is Boolean -> "Boolean"
        else -> "Unknown"
    }

fun main(args:Array<String>) {
    println(sum(4,5))
    println(maxOf(6,2))
    println("Length of the string is = ${getStringLength("Meghaditya Roy Chaudhury")}")

    // loop
    for (index in items.indices) {
        print("Item at $index is = ${items[index]}, ")
    }

    print("\n\"Meghaditya\" is a ${describe("Meghaditya")}\n")

    // range + step fn.
    for (i in 1..10 step 2) {
        print(i.toString() + " ")
    }
    for (i in 9 downTo 1 step 2) {
        print(i.toString() + " ")
    }
}