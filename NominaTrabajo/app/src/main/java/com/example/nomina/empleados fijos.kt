package com.example.nomina

class EmpleadoFijo(nombre: String, id: Int, salarioFijo: Double) : Empleado(nombre, id, salarioFijo) {
    override fun calcularSalario(): Double {
        return salarioBase
    }
}
