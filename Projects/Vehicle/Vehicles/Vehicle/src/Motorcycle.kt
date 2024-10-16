class Motorcycle(brand: String, model: String, year: Int, val hasSideCar: Boolean) : Vehicle(brand, model, year), Drivable {
    override fun drive() {
        println("Riding the motorcycle: $brand, model $model, year $year. Sidecar: $hasSideCar.")
    }

    fun ride(){
        println("Riding the motorcycle: $brand, model $model, year $year.")
    }
}