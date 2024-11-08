package com.example.nomina

class Nomina(private val empleados: List<Empleado>) {
    fun generarNominaMensual(): Map<Int, Double> {
        val nomina = mutableMapOf<Int, Double>()
        for (empleado in empleados) {
            nomina[empleado.id] = empleado.calcularSalario()
        }
        return nomina
    }
}