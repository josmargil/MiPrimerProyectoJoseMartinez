package com.jose_martinez.sprint1josemartinez

import kotlin.random.Random

fun main() {
    // Ejercicio 1
    val name = "Mary"
    val age = 20

    println("$name is $age years old")

    // Ejercicio 2
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    // Ejercicio 3
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalNumbers = greenNumbers.toSet() + redNumbers.toSet()

    println("Total: $totalNumbers")

    // Ejercicio 4
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = SUPPORTED.contains(requested)

    println("Support for $requested: $isSupported")

    // Ejercicio 5
    val alumnos = mapOf<String,Double>("Jose" to 9.8, "Juanjo" to 8.5, "Javier" to 5.5)

    // Ejercicio 6
    do {
        val firstResult = Random.nextInt(1,7)
        val secondResult = Random.nextInt(1,7)
        println("First: $firstResult, Second: $secondResult")

        if (firstResult != secondResult) {
            println("Lose")
        }

    } while (firstResult.equals(secondResult))

    println("Win")

    // Ejercicio 7
    val button = "A"

    println(when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    })
}