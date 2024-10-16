fun main() {

    val car = Car("Honda", "Civic", 2004, 4)
    car.displayVehicle()
    car.start()
    car.drive()
    car.stop()

    println()

    val motorcycle = Motorcycle("BMW", "HP2 Sport", 2019, false)
    motorcycle.displayVehicle()
    motorcycle.start()
    motorcycle.drive()
    motorcycle.stop()
}