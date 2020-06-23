package com.shengsiyuan2.kotlin

fun main(args: Array<String>) {
    //创建Int数组
    var array_int = intArrayOf(1, 2, 3, 4, 5)
    //更多的数组创建查看intArrayOf()源码实现即可

    println("Int Max = ${Int.MAX_VALUE}")

    var array = IntArray(10)
    array.set(0, 4)
    array.forEach { println(it) }

    println("------------------")
    for((index, value) in array.withIndex()){
        println("array[$index] = $value")
    }

}