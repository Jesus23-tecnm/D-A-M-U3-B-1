package com.example.vuelos

import kotlin.system.exitProcess

fun leerTarifa(): Tarifa {
    println("Ingrese la tarifa (1 para Económica, 2 para Ejecutiva):")
    return when (readLine()?.trim()?.toInt()) {
        1 -> Tarifa.ECONOMICA
        2 -> Tarifa.EJECUTIVA
        else -> {
            println("Opción inválida. Usando tarifa económica por defecto.")
            Tarifa.ECONOMICA
        }
    }
}

fun leerDescuento(): Double {
    println("Ingrese el descuento (0.0 a 1.0):")
    return readLine()?.trim()?.toDoubleOrNull() ?: 0.0
}

fun leerDatosReservaIndividual(): ReservaIndividual {
    println("Ingrese el nombre del pasajero:")
    val nombrePasajero = readLine()?.trim() ?: "Desconocido"

    println("Ingrese el número de vuelo:")
    val numeroVuelo = readLine()?.trim() ?: "Desconocido"

    println("Ingrese el precio base para la reserva individual:")
    val precioBase = readLine()?.trim()?.toDoubleOrNull() ?: 0.0

    val tarifa = leerTarifa()
    return ReservaIndividual(tarifa, precioBase, nombrePasajero, numeroVuelo)
}

fun main() {
    println("Ingrese el descuento para la reserva grupal (0.0 a 1.0):")
    val descuentoGrupal = leerDescuento()
    val reservaGrupal = ReservaGrupal(descuentoGrupal)

    println("Ingrese el número de reservas individuales:")
    val numReservas = readLine()?.trim()?.toIntOrNull() ?: 0

    repeat(numReservas) { index ->
        val reservaIndividual = leerDatosReservaIndividual()
        reservaGrupal.agregarReserva(reservaIndividual)
    }

    println("Ingrese el número de reservas grupales anidadas (0 si no hay):")
    val numReservasGrupales = readLine()?.trim()?.toIntOrNull() ?: 0

    repeat(numReservasGrupales) { index ->
        println("Ingrese el descuento para la reserva grupal anidada ${index + 1}:")
        val descuentoAnidada = leerDescuento()

        val reservaGrupalAnidada = ReservaGrupal(descuentoAnidada)

        println("Ingrese el número de reservas individuales en la reserva grupal anidada ${index + 1}:")
        val numReservasAnidadas = readLine()?.trim()?.toIntOrNull() ?: 0

        repeat(numReservasAnidadas) { innerIndex ->
            val reservaIndividualAnidada = leerDatosReservaIndividual()
            reservaGrupalAnidada.agregarReserva(reservaIndividualAnidada)
        }

        reservaGrupal.agregarReserva(reservaGrupalAnidada)
    }

    println("Detalles de la reserva grupal:")
    println(reservaGrupal.detalles())
    println("Costo total de la reserva grupal: ${reservaGrupal.calcularCosto()}")
}

