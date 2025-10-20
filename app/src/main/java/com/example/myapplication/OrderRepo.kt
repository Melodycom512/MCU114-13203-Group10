package com.example.Myapplication

object OrderRepo {
    var order: Order = Order()
    fun clear() {
        order = Order()
    }
}
