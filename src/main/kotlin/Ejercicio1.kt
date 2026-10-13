package com.github.apermar1301

class Employee(val firstName: String, val lastName: String, val salary: Double) {

    // Ejercicio 2
    constructor(attb : String) : this(
        attb.split("-")[0],
        attb.split("-")[1],
        attb.split("-")[2].toDouble()
    ) {

    }

    init {
        require(salary >= 0.0) { "Salary must be non-negative" }
    }

}

