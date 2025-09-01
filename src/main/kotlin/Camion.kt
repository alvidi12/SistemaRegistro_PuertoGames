class Camion : TransporteCarga() {
    private var patente: String = ""
    private var peso: Int = 0

    init {
        capacidad = 1000  // capacidad fija del camion
    }

    override fun ingresarDatos() {
        try {
            println("Ingrese patente del camión:")
            patente = readLine() ?: ""

            println("Ingrese el peso de la carga (Kg):")
            val entrada = readLine()
            peso = entrada?.toInt() ?: 0
        } catch (e: Exception) {
            println("Error al ingreso de datos: ${e.message}")
        }
    }

    override fun calcularCostoEnvio(): Int {
        return (peso * 2) + 200
    }

    override fun mostrarInfo() {
        println("Camión registrado:\nPatente: $patente, Peso: $peso kg, Capacidad: $capacidad kg")
        println("Costo de envío: $${calcularCostoEnvio()}")

        val sobrepeso = peso - capacidad
        if (sobrepeso > 0) {
            val costoExtra = sobrepeso * 2 // multa
            println("⚠️ Sobrepeso: (+$sobrepeso kg). Costo extra: $$costoExtra")
            println("Costo total: $${calcularCostoEnvio() + costoExtra}")
        }
    }
}