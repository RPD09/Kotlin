// Create a loop to iterate through an array and print the values in ascending order.

fun main() {
    val numbers = arrayOf(3, 7, 1, 9, 5)
    val sortedNumbers = numbers.sortedArray()

    for (number in sortedNumbers) {
        println(number)
    }
}
