
open class Vehiculo(val marca: String, val modelo: String, val capacidadCombustible: Int) {
    
    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }

    fun mostrarInformacion() {
        println("Vehículo: $marca $modelo | Combustible: ${capacidadCombustible}L | Autonomía: ${calcularAutonomia()} km")
    }
}

class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String) 
    : Vehiculo(marca, modelo, capacidadCombustible) {
    
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }

    override fun mostrarInformacion() {
        println("Automóvil ($tipo): $marca $modelo | Combustible: ${capacidadCombustible}L | Autonomía: ${calcularAutonomia()} km")
    }
}

class Motocicleta(marca: String, modelo: String, capacidadCombustible: Int, val cilindrada: Int) 
    : Vehiculo(marca, modelo, capacidadCombustible) {
    
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }

    override fun mostrarInformacion() {
        println("Motocicleta ${cilindrada}cc: $marca $modelo | Combustible: ${capacidadCombustible}L | Autonomía: ${calcularAutonomia()} km")
    }
}

fun main() {
    val auto1 = Automovil("Toyota", "Corolla", 50, "Sedán")
    val auto2 = Automovil("BMW", "X5", 70, "SUV")
    val moto1 = Motocicleta("Honda", "CBR600RR", 15, 600)

    val vehiculos = listOf(auto1, auto2, moto1)

    vehiculos.forEach { it.mostrarInformacion() }
}
