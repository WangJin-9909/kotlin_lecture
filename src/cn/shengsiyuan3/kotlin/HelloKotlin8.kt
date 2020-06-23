package com.shengsiyuan3.kotlin

fun main(args: Array<String>) {
    val a = 5
    val b = 10

    //判断范围，a是否在2 到b之间
    //传统方法
    if (a > 2 && a < b) {
        println("a is in 2..b")
    }
    //Kotlin方法
    if (a in 2..b) {
        println("a is in 2..b")
    }

    if (a in 1 + 1..10 - 1) {
        println("a is in 1+1 .. 10-1")
    }

    val c = 'c'
    if (c in 'a'..'g') {
        println("c is in a..g")
    }
    if (c !in 'j'..'p') {
        println("c is not in j..p")
    }

    //.. 是运算符重写，等价于rangeTo()方法
    //定义一个CharRange
    var char_range: CharRange = CharRange('a', 'd')
    //遍历这个Range
    for (i in char_range) {
        print("   i = ${i}")
    }

    //定义一个IntRange
    val int_range: IntRange = IntRange(1, 100)
    //遍历这个IntRage
    for (i in int_range) {
        print("    i = ${i}")
    }
    println("   ")

    //上面的方法等价于
    val int_ragne_2 = 10.downTo(1)
    val int_range_3 = 1.rangeTo(100)
    val int_range_4 = 1..100
    for (i in int_ragne_2) {
        print("  i = ${i}")
    }
}

