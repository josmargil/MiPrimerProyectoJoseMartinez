package com.jose_martinez.sprint1josemartinez

import kotlin.math.abs

fun main() {
    // Ejercicio 1
    print("Introduce una contraseña: ")

    val password = readln()

    val errors = mutableListOf<String>()

    if (password.length < 8) {
        errors.add("Debe tener al menos 8 caracteres")
    }

    if (!password.any { it.isUpperCase() }) {
        errors.add("Debe tener al menos una mayúscula")
    }

    if (!password.any { it.isLowerCase() }) {
        errors.add("Debe tener al menos una minúscula")
    }

    if (!password.any { it.isDigit() }) {
        errors.add("Debe tener al menos un número")
    }

    if (password.contains(" ")) {
        errors.add("No debe contener espacios")
    }

    if (errors.isEmpty()) {
        println("Contraseña válida")
    } else {
        println("Contraseña inválida: $errors")
    }

    // Ejercicio 2
    val temperatures = mutableListOf<Double>()
    val inputTemperatures = true

    while (inputTemperatures) {
        print("Introduce temperaturas (escribe fin para acabar de introducir): ")
        val newTemperature = readln()

        if (newTemperature == "fin") {
            break
        }

        temperatures.add(newTemperature.toDouble())
    }

    if (temperatures.isEmpty()) {
        println("No hay temperaturas introducidas")
        return
    }

    val maximum = temperatures.max()
    val minimum = temperatures.min()
    val average = temperatures.average()

    var quantityAboveAverage = 0
    var maximumDifference = 0.0

    for (temperature in temperatures) {
        if (temperature > average) {
            quantityAboveAverage++
        }
    }

    for (i in 1 until temperatures.size) {
        val previous = temperatures[i - 1]
        val current = temperatures[i]

        val difference = abs(current - previous)

        if (difference > maximumDifference) {
            maximumDifference = difference
        }

        if (current > previous) {
            println("De $previous a $current: Subió")
        } else if (current < previous) {
            println("De $previous a $current: Bajó")
        } else {
            println("De $previous a $current: Se mantuvo")
        }
    }

    println("Máxima: $maximum")
    println("Mínima: $minimum")
    println("Media: $average")
    println("Por encima de la media: $quantityAboveAverage")
    println("Mayor variación consecutiva: $maximumDifference")

    // Ejercicio 3
    val email: String? = "jose@alu.com"

    email?.let {
        if (it.contains("@") && (it.contains(".com") || it.contains(".es"))) {
            println("Enviando mensaje a $it")
        } else {
            println("Email inválido")
        }

    } ?: println("No se ha indicado ningún email")
}