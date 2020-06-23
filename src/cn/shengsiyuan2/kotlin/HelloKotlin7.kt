package com.shengsiyuan2.kotlin

fun main(args: Array<String>) {
    println(myPrint("hello"))

    var a = 6
    var result = when (a) {
        1 -> {
            println(" a = 1")
            10
        }
        2 -> {
            println("a = 2")
            20
        }
        3, 4, 5 -> {
            println("a = 2, or 4 or 5")
            30
        }
        in 6..10 -> {//这里都是闭区间
            println("a is in 6..10")
            40
        }
        else -> {
            println("-------------")
        }
    }
}

fun myPrint(str: String) = when (str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    else -> "other"
}