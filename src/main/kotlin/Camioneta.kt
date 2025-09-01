class Camioneta(patente: String, peso: Double) :
    TransporteCarga(patente, peso) {

    override fun calcularCostoEnvio(): Double {
        return (peso * 0.5)
    }

    companion object {
        fun crear(): Result<Camioneta> {
            return try {
                println("Ingrese la patente de la Camioneta:")
                val patente = readLine() ?: ""

                println("Ingrese el peso de la carga:")
                val peso = readLine()?.toDoubleOrNull() ?: throw Exception("Peso inválido")

                if (patente.isBlank()) return Result.failure(Exception("No puede estar vacía"))

                Result.success(Camioneta(patente, peso))
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
}
