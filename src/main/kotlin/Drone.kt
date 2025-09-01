class Drone(patente: String, peso: Double) :
    TransporteCarga(patente, peso) {

    override fun calcularCostoEnvio(): Double {
        return (peso * 0.8)
    }

    companion object {
        fun crear(): Result<Drone> {
            return try {
                println("Ingrese el código del Drone:")
                val patente = readLine() ?: ""

                println("Ingrese el peso de la carga:")
                val peso = readLine()?.toDoubleOrNull() ?: throw Exception("Peso inválido")

                if (patente.isBlank()) return Result.failure(Exception("No puede estar vacía"))

                Result.success(Drone(patente, peso))
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
}
