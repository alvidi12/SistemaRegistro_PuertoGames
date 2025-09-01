abstract class TransporteCarga {
    protected var capacidad: Int = 0

    abstract fun ingresarDatos()
    abstract fun calcularCostoEnvio(): Int
    abstract fun mostrarInfo()
}
