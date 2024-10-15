// Create a program that sorts 3 values from largest to smallest using if and else

fun main(args: Array<String>) {

    val value1: Int = 2
    val value2: Int = 4
    val value3: Int = 1

    if (value1 > value2 && value1 > value3) {
        if (value2 > value3) {
            println("$value1, $value2, $value3")
        } else {
            println("$value1, $value3, $value2")
        }
    } else if (value2 > value1 && value2 > value3) {
        if (value1 > value3) {
            println("$value2, $value1, $value3")
        } else {
            println("$value2, $value3, $value1")
        }
    } else if (value3 > value1 && value3 > value2) {
        if (value1 > value2) {
            println("$value3, $value1, $value2")
        } else {
            println("$value3, $value2, $value1")
        }
    } else {
        println("Error")
    }
}
