package com.example.calculator

fun main(){
    while (true) {
        println("============계산기를 실행합니다============")
        val numType1 = println("첫번째 숫자를 입력하세요.")
        var num1 = readLine()!!.toDouble()
g
        val opTyping = println("연사자를 입력해주세요 (+,-,*,/)")
        var op = readLine()

        val numType2 = println("두번째 숫자를 입력하세요.")
        var num2 = readLine()!!.toDouble()

        val add = Calculator(AddOperation())
        val sub = Calculator(SubstractOperation())
        val mul = Calculator(MultiplyOperation())
        val div = Calculator(DivideOperation())

        when (op) {
            "+" -> println("${num1} + ${num2} = ${add.operate(num1, num2)}")
            "-" -> println("${num1} - ${num2} = ${sub.operate(num1, num2)}")
            "*" -> println("${num1} * ${num2} = ${mul.operate(num1, num2)}")
            "/" -> println("${num1} / ${num2} = ${div.operate(num1, num2)}")
            else -> println("연산 입력 오류! 연산 재실행해주세요")
        }

        var iswanted = println("새로운 연산을 하고 싶으면 1, 종료하고 싶은면 2를 눌러주세요")
        var ty = readLine()!!.toInt()
        if(ty == 2) break
    }
    println("============계산기를 종료합니다============")
}