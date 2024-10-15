// Create a different function that performs addition, division, subtraction, multiplication, and remainder of division between 2 values

fun main(args: Array<String>) {

    println(add(1, 2))
    println(subtract(3, 2))
    println(multiply(4, 3))
    println(divide(5, 2))
    println(remainder(6, 7))
    
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): Int {
    return a / b
}

fun remainder(a: Int, b: Int): Int {
    return a % b
}
