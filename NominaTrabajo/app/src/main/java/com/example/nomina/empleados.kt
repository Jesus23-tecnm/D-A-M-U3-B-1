package com.example.nomina

abstract class Empleado(val nombre: String, val id: Int, val salarioBase: Double) {
    abstract fun calcularSalario(): Double
}