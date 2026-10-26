package com.github.apermar1301

class Product(
    val name: String,
    var price: Double,
    val discount: Double = 0.0
) {

    init {
        require(price >= 0.0) { "Price must be non-negative" }
        require(discount in 0.0..100.0) { "Discount must be between 0 and 100" }
    }

    fun applyDiscount() {
        price = finalPrice()
    }

    fun finalPrice(): Double = price * (1.0 - discount / 100.0)
}
