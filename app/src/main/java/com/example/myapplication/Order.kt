package com.example.Myapplication

import java.io.Serializable

data class Order(
    var main: String? = null,
    var sides: ArrayList<String> = ArrayList(),
    var drink: String? = null
) : Serializable {
    fun isComplete(): Boolean = (main != null) && (sides.isNotEmpty()) && (drink != null)
}
