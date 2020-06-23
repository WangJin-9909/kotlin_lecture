package com.shengsiyuan2.kotlin

fun main(args: Array<String>) {

    //if 的简介形式
    var x = 10
    var y = 20
    var max = if (x > y) x else y

    //========================================
    //自动推理
    var x_1 = 10
    var y_1 = 20
    var max_1 = if (x_1 > y_1) {
        println("x_1 > y_1")
        x_1
    } else {
        println("x_1 <= y_1")
        y_1
    }

}