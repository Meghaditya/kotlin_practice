package Basics

fun main(args:Array<String>) {
    // create an array
    var array = Array(5, {i -> (i*i).toString() })
    for(i in array) {
        //println(i)
    }

    //example of boxed array type
    var x : IntArray = intArrayOf(1,2,3,4,5,6)
    for (xi in x) {
        //println(xi)
    }

    var text =  """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """
    println(text)
    text = text.trimMargin()
    println(text)
}