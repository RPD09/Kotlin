class Car(brand: String, model: String, year: Int, val numberOfDoors: Int) : Vehicle(brand, model, year), Drivable{
    override fun drive(){
        println("Driving the car: $brand, model $model, year $year, with $numberOfDoors doors")
    }
}