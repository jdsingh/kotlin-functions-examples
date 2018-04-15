package functions

private data class AwesomeString(var value: String) {

    infix fun shouldBeSame(foo: String): Boolean {
        return foo == value
    }

//    infix fun append(foo: String, bar: String) {
//        value = "$value $foo $bar"
//    }

}

private infix fun AwesomeString.shouldNotBeSame(word: String): Boolean {
    return value != word
}

//infix fun print(word: String) {
//    println(word)
//}

fun main(args: Array<String>) {

    val hello = AwesomeString("Hello")

    println(hello shouldBeSame "Bello")

    println(hello shouldNotBeSame "Bello")

}