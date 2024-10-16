// Create a class Person with properties name and age. 
// Write a function that prints a greeting for the person, showing their name and age.

class Person(val name: String, val age: Int)

fun greetPerson(person: Person) {
    println("Hello, my name is ${person.name} and I am ${person.age} years old.")
}

fun main() {
    val person = Person("Rafael", 20)
    greetPerson(person)
}
