package com.example.calculator

class DivideOperation : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        require(num2 != 0.toDouble()) {
            ArithmeticException("Divide by Zero")
        }
        return num1 / num2
    }
}