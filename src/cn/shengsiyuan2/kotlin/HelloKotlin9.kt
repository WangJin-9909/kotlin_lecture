package com.shengsiyuan2.kotlin

fun main(args: Array<String>) {
    var array = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")
    if("world" in array){
        println("word in array")
    }
}