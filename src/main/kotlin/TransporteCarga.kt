abstract class TransporteCarga(
    val patente: String,
    val peso: Double,
    val capacidad: Double = 5000.0   // valor
) {
    abstract fun calcularCostoEnvio(): Double

    fun mostrarInfo() {
        println("Vehículo [Patente: $patente, Peso: $peso, Capacidad máxima: $capacidad]")
        println("Costo de envío: $${calcularCostoEnvio()}")

        if (peso > capacidad) {
            val sobrepeso = peso - capacidad
            val costoExtra = sobrepeso * 2   // regla inventada: 2 pesos extra por kilo extra
            println("Sobrepeso: (+$sobrepeso kg). Costo adicional: $$costoExtra")
            println("Costo total con sobrepeso: $${calcularCostoEnvio() + costoExtra}")
        }
    }
}
