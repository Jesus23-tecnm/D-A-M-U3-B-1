package com.example.vuelos

class ReservaGrupal(private val descuento: Double) : Reserva {
    private val reservas: MutableList<Reserva> = mutableListOf()

    fun agregarReserva(reserva: Reserva) {
        reservas.add(reserva)
    }

    override fun calcularCosto(): Double {
        val costoTotal = reservas.sumOf { it.calcularCosto() }
        return costoTotal * (1 - descuento)
    }

    fun detalles(): String {
        return reservas.joinToString("\n") {
            if (it is ReservaIndividual) it.detalles() else ""
        }
    }
}

