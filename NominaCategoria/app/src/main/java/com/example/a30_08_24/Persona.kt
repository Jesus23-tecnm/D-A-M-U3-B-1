package com.example.a30_08_24

class Trabajador(
    val nombre: String,
    val categoria: Int,
    val horasTrabajo: Int,
    val horasExtra: Int

)
{
     val PRECIO_HORA_BASE = 90
    // Función para calcular el precio por hora según la categoría
    private fun calcularPrecioHora(): Double {
        return when (categoria) {
            1 -> PRECIO_HORA_BASE * 1.45
            2 -> PRECIO_HORA_BASE * 1.25
            else -> PRECIO_HORA_BASE.toDouble()
        }
    }

    // Función para calcular el precio de las horas extras
    private fun calcularPrecioHoraExtra(): Double {
        return when {
            horasExtra < 10 -> calcularPrecioHora() * 1.5
            horasExtra in 10..20 -> calcularPrecioHora() * 1.4
            else -> calcularPrecioHora() * 1.2
        }
    }

    // Función para calcular la nómina semanal
    fun calcularNominaSemanal(): Double {
        val sueldoBase = horasTrabajo * calcularPrecioHora()
        val sueldoExtra = horasExtra * calcularPrecioHoraExtra()
        return sueldoBase + sueldoExtra
    }

    // Representación del trabajador
    override fun toString(): String {
        return "Nombre: $nombre, Categoría: $categoria, Horas Trabajo: $horasTrabajo, Horas Extra: $horasExtra, Nómina Semanal: ${calcularNominaSemanal()}"
    }
}