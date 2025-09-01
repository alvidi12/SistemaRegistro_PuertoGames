fun main() {
    val listaTransportes = mutableListOf<TransporteCarga>()

    repeat(2) {
        println("Registro de vehículo: ${it + 1}")
        println("Seleccione tipo de transporte:\n(1) Camión \n(2) Camioneta \n(3) Drone")

        val transporte: TransporteCarga? = when (readLine()) {
            "1" -> Camion()
            "2" -> Camioneta()
            "3" -> Drone()
            else -> {
                println("Opción inválida")
                null
            }
        }

        transporte?.let {
            it.ingresarDatos()
            println("Vehículo registrado")
            it.mostrarInfo()
            listaTransportes.add(it)
        }
    }

    println("Lista final de vehículos registrados")
    listaTransportes.forEach { it.mostrarInfo() }
}
