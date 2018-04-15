package functions

private inline fun task(op: () -> Unit) {
    println("Before the operation")

    op()

    println("After the operation")

    println("This is very very important step")
}

private inline fun task2(noinline op: () -> Unit, op1: () -> Unit) {
    println("Before the operation")

    op()

    op1()

    println("After the operation")
}

private inline fun task3(crossinline op: () -> Unit) {
    println("Before the operation")

    op()

    println("After the operation")
}

fun main(args: Array<String>) {

    task {
        println("I'm inlined")
    }

    task2({
        println("I'm no inlined")
    }) {
        println("I'm inlined")
    }

    task3 {
        println("I'm crossinlined")
    }

}
