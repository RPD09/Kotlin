// Create a program that asks for 3 grades and calculates the average

fun main(args: Array<String>) {

    print("Enter the first grade: ")
    val grade1 = readln().toInt()

    print("Enter the second grade: ")
    val grade2 = readln().toInt()

    print("Enter the third grade: ")
    val grade3 = readln().toInt()

    val average = (grade1 + grade2 + grade3) / 3

    println("Average = $average")
}
