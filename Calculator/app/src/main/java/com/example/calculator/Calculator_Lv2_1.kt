package com.example.calculator

fun main(){
    println("============계산기를 실행합니다============")

    Calculator_Lv2_1().operator()

    println("============계산기를 종료합니다============")
}

class Calculator_Lv2_1 {
    fun operator() {
        while (true) {
            val numtTying1 = println("첫번째 숫자를 입력하세요.")
            var num1 = readLine()!!.toDouble()

            val opTyping = println("연사자를 입력해주세요 (+,-,*,/,%)")
            var op = readLine()

            val numtTying2 = println("두번째 숫자를 입력하세요.")
            var num2 = readLine()!!.toDouble()

            when (op) {
                "+" -> println("결과 : ${num1 + num2}")
                "-" -> println("결과 : ${num1 - num2}")
                "*" -> println("결과 : ${num1 * num2}")
                "/" -> println("결과 : ${num1 / num2}")
                "%" -> println("결과 : ${num1 % num2}")
                else -> println("연산자를 올바르게 입력해주세요")
            }
            var iswanted = println("새로운 연산을 하고 싶으면 1, 종료하고 싶은면 2를 눌러주세요")
            var ty = readLine()!!.toInt()
            if(ty == 2) break
        }
    }
}