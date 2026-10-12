package com.github.apermar1301

class Employee(val firstName: String, val lastName: String, val salary: Double) {

    init {
        require(salary >= 0.0) { "Salary must be non-negative" }
    }

}

