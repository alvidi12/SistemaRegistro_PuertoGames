fun main() {
    val listaTransportes = mutableListOf<TransporteCarga>()

    repeat(2) {
        println("Registro de vehículo ${it + 1}")
        println("Seleccione tipo de transporte: (1) Camión (2) Camioneta (3) Drone")
        when (readLine()) {
            "1" -> Camion.crear()
                .onSuccess {
                    println("Camión registrado")
                    it.mostrarInfo()
                    listaTransportes.add(it)
                }
                .onFailure { println("Error: ${it.message}") }

            "2" -> Camioneta.crear()
                .onSuccess {
                    println("Camioneta registrada")
                    it.mostrarInfo()
                    listaTransportes.add(it)
                }
                .onFailure { println("Error: ${it.message}") }

            "3" -> Drone.crear()
                .onSuccess {
                    println("Drone registrado")
                    it.mostrarInfo()
                    listaTransportes.add(it)
                }
                .onFailure { println("Error: ${it.message}") }

            else -> println("Opción inválida")
        }
    }

    println("\nLista de vehículos registrados")
    listaTransportes.forEach { it.mostrarInfo() }
}
