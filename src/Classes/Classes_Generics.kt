package Classes

abstract class Source<out T>{
    abstract fun nextT() : T
}

fun demo(str: Source<String>){
    val objects: Source<Any> = str
}

fun copy(from:Array<out Any>, to:Array<Any>) {
    if (from.size == to.size) {
        for (i in from.indices) {
            to[i] = from[i]
        }
    }
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };
    abstract fun signal(): ProtocolState
}

inline fun <reified T:Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name + "," + it.ordinal })
}

fun main(args:Array<String>) {
    var a1:Array<Int> = arrayOf(1,2,3)
    var a2 = Array<Any>(3){}
    copy(a1, a2)
    a2.forEach { println(it) }

    printAllValues<ProtocolState>()
}