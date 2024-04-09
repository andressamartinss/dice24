package com.example.diceroller

class Diceroller(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
