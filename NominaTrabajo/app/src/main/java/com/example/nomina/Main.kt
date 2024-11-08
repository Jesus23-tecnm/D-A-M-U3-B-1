package com.example.nomina
/*
fun solicitarDatosEmpleado(): Empleado {
    println("Ingrese el nombre del empleado:")
    val nombre = readLine() ?: ""

    println("Ingrese el ID del empleado:")
    val id = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el tipo de empleado (fijo, porHoras, porComision):")
    val tipo = readLine() ?: ""

    println("Ingrese el salario base del empleado:")
    val salarioBase = readLine()?.toDoubleOrNull() ?: 0.0

    return when (tipo) {
        "fijo" -> EmpleadoFijo(nombre, id, salarioBase)
        "porHoras" -> {
            println("Ingrese la tarifa por hora:")
            val tarifaPorHora = readLine()?.toDoubleOrNull() ?: 0.0
            println("Ingrese las horas trabajadas:")
            val horasTrabajadas = readLine()?.toDoubleOrNull() ?: 0.0
            println("Ingrese las horas extras (opcional, 0 si no aplica):")
            val horasExtras = readLine()?.toDoubleOrNull() ?: 0.0
            EmpleadoPorHoras(nombre, id, salarioBase, tarifaPorHora, horasTrabajadas, horasExtras)
        }
        "porComision" -> {
            println("Ingrese el porcentaje de comisión:")
            val porcentajeComision = readLine()?.toDoubleOrNull() ?: 0.0
            println("Ingrese las ventas generadas:")
            val ventasGeneradas = readLine()?.toDoubleOrNull() ?: 0.0
            EmpleadoPorComision(nombre, id, salarioBase, porcentajeComision, ventasGeneradas)
        }
        else -> throw IllegalArgumentException("Tipo de empleado no válido")
    }
}

fun main() {
    println("¿Cuántos empleados desea ingresar?")
    val cantidad = readLine()?.toIntOrNull() ?: 0

    val empleados = mutableListOf<Empleado>()

    for (i in 1..cantidad) {
        println("Ingrese los datos del empleado $i:")
        val empleado = solicitarDatosEmpleado()
        empleados.add(empleado)
    }

    val nomina = Nomina(empleados)
    val resultados = nomina.generarNominaMensual()

    println("Nómina mensual:")
    for ((id, salario) in resultados) {
        println("Empleado ID: $id, Salario: $salario")
    }
}
 */

// Funciones auxiliares y la función main pueden estar en el mismo archivo
fun solicitarDatosEmpleado(): Empleado {
    println("Ingrese el nombre del empleado:")
    val nombre = readLine() ?: ""

    println("Ingrese el ID del empleado:")
    val id = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el tipo de empleado (fijo, porHoras, porComision):")
    val tipo = readLine() ?: ""

    println("Ingrese el salario base del empleado:")
    val salarioBase = readLine()?.toDoubleOrNull() ?: 0.0

    return when (tipo) {
        "fijo" -> EmpleadoFijo(nombre, id, salarioBase)
        "porHoras" -> {
            println("Ingrese la tarifa por hora:")
            val tarifaPorHora = readLine()?.toDoubleOrNull() ?: 0.0
            println("Ingrese las horas trabajadas:")
            val horasTrabajadas = readLine()?.toDoubleOrNull() ?: 0.0
            println("Ingrese las horas extras (opcional, 0 si no aplica):")
            val horasExtras = readLine()?.toDoubleOrNull() ?: 0.0
            EmpleadoPorHoras(nombre, id, salarioBase, tarifaPorHora, horasTrabajadas, horasExtras)
        }
        "porComision" -> {
            println("Ingrese el porcentaje de comisión:")
            val porcentajeComision = readLine()?.toDoubleOrNull() ?: 0.0
            println("Ingrese las ventas generadas:")
            val ventasGeneradas = readLine()?.toDoubleOrNull() ?: 0.0
            EmpleadoPorComision(nombre, id, salarioBase, porcentajeComision, ventasGeneradas)
        }
        else -> throw IllegalArgumentException("Tipo de empleado no válido")
    }
}

fun main() {
    println("¿Cuántos empleados desea ingresar?")
    val cantidad = readLine()?.toIntOrNull() ?: 0

    val empleados = mutableListOf<Empleado>()

    for (i in 1..cantidad) {
        println("Ingrese los datos del empleado $i:")
        val empleado = solicitarDatosEmpleado()
        empleados.add(empleado)
    }

    val nomina = Nomina(empleados)
    val resultados = nomina.generarNominaMensual()

    println("Nómina mensual:")
    for ((id, salario) in resultados) {
        println("Empleado ID: $id, Salario: $salario")
    }
}