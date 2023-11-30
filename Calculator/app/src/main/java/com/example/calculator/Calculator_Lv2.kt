package com.example.calculator

fun main(){
    println("============계산기를 실행합니다============")

    Calculator_Lv2().operator1()

    println("============계산기를 종료합니다============")
}

class Calculator_Lv2 {


    fun operator1() {
        val numtTying1 = println("첫번째 숫자를 입력하세요.")
        var num1 = readLine()!!.toDouble()

        val opTyping = println("연사자를 입력해주세요 (+,-,*,/,%)")
        var op = readLine()

        val numtTying2 = println("두번째 숫자를 입력하세요.")
        var num2 = readLine()!!.toDouble()

        when(op) {
            "+" -> println("결과 : ${num1+num2}")
            "-" -> println("결과 : ${num1-num2}")
            "*" -> println("결과 : ${num1*num2}")
            "/" -> println("결과 : ${num1/num2}")
            "%" -> println("결과 : ${num1%num2}")
            else -> println("연산자를 올바르게 입력해주세요")
        }

        val opTyping2 = println("추가 연산을 원하면 같은 연산자를 입력하세요")
        var op2 = readLine()!!
        val numtTying3 = println("세번째 숫자를 입력하세요.")
        var num3 = readLine()!!.toDouble()

        when(op2) {
            "+" -> println("결과 : ${num1+num2+num3}")
            "-" -> println("결과 : ${num1-num2-num3}")
            "*" -> println("결과 : ${num1*num2*num3}")
            "/" -> println("결과 : ${num1/num2/num3}")
            "%" -> println("결과 : ${num1%num2%num3}")
            else -> println("연산자를 올바르게 입력해주세요")
        }
    }
}