package com.example.calculator

fun main(){

    Calculator_Lv1().operator()
}

class Calculator_Lv1 {
    val numtTying1 = println("첫번째 숫자를 입력하세요.")
    var num1 = readLine()!!.toDouble()
    val operatorTyping = println("연사자를 입력해주세요 (+,-,*,/)")
    var op = readLine()
    val numtTying2 = println("두번째 숫자를 입력하세요.")
    var num2 = readLine()!!.toDouble()

    fun operator (){
        if(op == "+") {
            println(num1 + num2)
        } else if (op == "-") {
            println(num1 - num2)
        } else if (op == "*") {
            println(num1 * num2)
        } else if (op == "/") {
            println(num1 / num2)
        } else {
            println("연산자를 바르게 입력해주세요 (+,-,*,/)")
        }
    }

}