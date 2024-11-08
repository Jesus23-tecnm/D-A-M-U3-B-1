package com.example.nomina

class EmpleadoPorHoras(
    nombre: String,
    id: Int,
    salarioBase: Double,
    private val tarifaPorHora: Double,
    private val horasTrabajadas: Double,
    private val horasExtras: Double = 0.0, // Horas extras si las hay
    private val tarifaHorasExtras: Double = 1.5 // 50% más por hora extra
) : Empleado(nombre, id, salarioBase) {

    override fun calcularSalario(): Double {
        val salarioHoras = tarifaPorHora * horasTrabajadas
        val salarioHorasExtras = tarifaHorasExtras * tarifaPorHora * horasExtras
        return salarioBase + salarioHoras + salarioHorasExtras
    }
}