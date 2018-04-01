package functions

fun main(args: Array<String>) {

    outerFunction("This is nice")

}

fun outerFunction(nice: String) {

    val hello = "Hello, world"

    fun innerFunction(awesome: String) {
        println(awesome)

        println(nice)

        println(hello)
    }

    innerFunction("This is awesome")

}
