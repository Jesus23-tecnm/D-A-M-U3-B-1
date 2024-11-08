package com.example.nomina

class EmpleadoPorComision(
    nombre: String,
    id: Int,
    salarioBase: Double,
    private val porcentajeComision: Double,
    private val ventasGeneradas: Double
) : Empleado(nombre, id, salarioBase) {

    override fun calcularSalario(): Double {
        return salarioBase + (porcentajeComision / 100) * ventasGeneradas
    }
}