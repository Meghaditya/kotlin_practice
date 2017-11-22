package Classes

class PrivateSetter {
    var SomeProperty : String = "Some Value"
    private set
}

sealed class Expr
data class Const(val number: Double): Expr()
data class Sum(val e1: Expr, val e2: Expr): Expr()
data class Product(val e1: Expr, val e2: Expr): Expr()
object NotAnumber: Expr()

fun eval(expr: Expr):Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    is Product -> eval(expr.e1) * eval(expr.e2)
    NotAnumber -> Double.NaN
    // else clause is not required because all cases are covered
}

fun main(args:Array<String>) {
    var privateSetter = PrivateSetter()
    print(privateSetter.SomeProperty)
}