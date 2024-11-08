package com.example.a30_08_24

fun main() {
    // Mapa para almacenar los trabajadores
    val trabajadores = mutableMapOf<String, Trabajador>()

    // Pedir datos al usuario
    while (true) {
        println("Ingrese el nombre del trabajador (o 'salir' para terminar): ")
        val nombre = readLine() ?: break
        if (nombre.lowercase() == "salir") break

        println("Ingrese la categoría del trabajador (1, 2, 3): ")
        val categoria = readLine()?.toIntOrNull() ?: continue

        println("Ingrese las horas trabajadas: ")
        val horasTrabajo = readLine()?.toIntOrNull() ?: continue

        println("Ingrese las horas extras trabajadas: ")
        val horasExtra = readLine()?.toIntOrNull() ?: continue

        // Crear un trabajador y agregarlo al mapa
        val trabajador = Trabajador(nombre, categoria, horasTrabajo, horasExtra)
        trabajadores[nombre] = trabajador
    }

    // Mostrar las nóminas de todos los trabajadores
    println("\nNóminas de los trabajadores:")
    trabajadores.forEach { (_, trabajador) ->
        println(trabajador)
    }
}



/*
fun main() {
    // Pedir datos al usuario
    println("Ingrese el nombre del trabajador: ")
    val nombre = readLine() ?: return

    println("Ingrese la categoría del trabajador (1, 2, 3): ")
    val categoria = readLine()?.toIntOrNull() ?: return

    println("Ingrese las horas trabajadas: ")
    val horasTrabajo = readLine()?.toIntOrNull() ?: return

    println("Ingrese las horas extras trabajadas: ")
    val horasExtra = readLine()?.toIntOrNull() ?: return

    // Crear un trabajador
    val trabajador = Trabajador(nombre, categoria, horasTrabajo, horasExtra)

    // Mostrar la nómina del trabajador
    println("\nNómina del trabajador:")
    println(trabajador)
}

 */