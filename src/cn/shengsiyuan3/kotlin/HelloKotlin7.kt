package com.shengsiyuan3.kotlin

fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("test"))

    println("------------------")
    println(myPrint_2("hello"))
    println(myPrint_2("world"))
    println(myPrint_2("test"))

    println("------------------")
    var a = 6
    var result = when (a) {
        1 -> {
            println("a =  1")
            "a = 1"
        }
        2 -> {
            println("a = 2")
            "a = 2"
        }
        3, 4, 5 -> {
            println("a = 3 or a = 4 or a = 5")
            "a =3 or a = 4 or a = 5"
        }
        in 6..10 -> {
            println("a is between 6 and 10")
            "a is in 6 .. 10"
        }
        else -> {
            println("unknow")
            "unknow"
        }
    }
}


fun myPrint(str: String): String {
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}

fun myPrint_2(str: String) = when (str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    "hello world" -> "HELLO WORLD"
    else -> "other input"
}