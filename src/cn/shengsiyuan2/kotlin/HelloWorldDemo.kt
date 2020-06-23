package com.wa.shengsiyuan2.kotlin

import java.util.function.Consumer


fun main(args: Array<String>) {
    println("Hello World")
    val list: List<String> = listOf("hello", "world", "hello world")
    //第一种遍历方法
    for (str in list) {
        println(str)
    }
    //下面几种方式不理解
    println("-----------------")
    //第二种遍历方法
    list.forEach { println(it) }
    println("+++++++++++++++++")
    //第三种遍历方法
    list.forEach(Consumer { println(it) })
    println("*****************")
    list.forEach(System.out::println)
}