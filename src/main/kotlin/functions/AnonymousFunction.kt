package functions

private fun task(foo: Int, op: (Int) -> Int) {
    println(op(foo))
}

private fun <T> task2(foo: T, op: (T) -> T) {
    println(op(foo))
}

fun main(args: Array<String>) {

    task(3) { x ->
        x * x
    }

    task2("foo", fun(x): Int {
        println(x)
        return 42
    })

}
