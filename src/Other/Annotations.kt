package Other

// Need to re-visit this chapter with more knowledge about Java annotations

@Target(AnnotationTarget.CLASS,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy

@Fancy class Foo {
    @Fancy fun baz(@Fancy foo : Int) : Int{
        return(@Fancy 1)
    }
}

fun main(args:Array<String>) {

}