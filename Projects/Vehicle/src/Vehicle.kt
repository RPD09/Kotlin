open class Vehicle(val brand: String, val model: String, val year: Int) {

    private var isRunning: Boolean = false

    fun start() {
        if (isRunning) {
            throw IllegalStateException("Vehicle already running")
        }
        isRunning = true
        println("The vehicle: $brand, model $model, year $year started")
    }

    fun stop() {
        if (!isRunning) {
            throw IllegalStateException("Vehicle is not running")
        }
        isRunning = false
        println("The vehicle: $brand, model $model, year $year stopped")
    }

    fun displayVehicle() {
        println("Vehicle details: $brand, model $model, year $year ")
    }
}
