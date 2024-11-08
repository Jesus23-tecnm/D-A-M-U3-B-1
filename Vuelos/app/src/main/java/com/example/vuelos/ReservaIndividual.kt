package com.example.vuelos

class ReservaIndividual(
    private val tarifa: Tarifa,
    private val precioBase: Double,
    private val nombrePasajero: String,
    private val numeroVuelo: String
) : Reserva {
    override fun calcularCosto(): Double {
        return precioBase * tarifa.multiplicador
    }

    fun detalles(): String {
        return "Pasajero: $nombrePasajero, Vuelo: $numeroVuelo, Costo: ${calcularCosto()}"
    }
}
