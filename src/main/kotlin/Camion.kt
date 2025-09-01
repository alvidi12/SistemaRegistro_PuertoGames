class Camion(patente: String, peso: Double) :
    TransporteCarga(patente, peso) {

    override fun calcularCostoEnvio(): Double {
        return (peso * 0.3)
    }

    companion object {
        fun crear(): Result<Camion> {
            return try {
                println("Ingrese la patente del Camión:")
                val patente = readLine() ?: ""

                println("Ingrese el peso de la carga:")
                val peso = readLine()?.toDoubleOrNull() ?: throw Exception("Peso inválido")

                if (patente.isBlank()) return Result.failure(Exception("No puede estar vacía"))

                Result.success(Camion(patente, peso))
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
}
