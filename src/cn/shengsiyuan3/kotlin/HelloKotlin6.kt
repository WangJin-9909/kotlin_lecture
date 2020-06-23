package com.shengsiyuan3.kotlin

fun main(args: Array<String>) {
    //1.创建Int数组
    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)
    //2.遍历Int数组
    for (item: Int in array) {
        println(item)

    }
    //以索引的方式遍历
    for(i in array.indices){
        println("array[$i] = ${array[i]}")
    }
    println("----------------------------------------")
    //创建Char数组
    var array_char: CharArray = charArrayOf('c', 'd', 'e', 'f', 'g')
    //遍历Char数组
    for (item: Char in array_char) {
        println(item)
    }
    for(i in array_char.indices){
        println("array[$i] = ${array_char[i]}")
    }
    println("---------------------------------------")
    //创建字符数组
    var array_string : Array<String> = arrayOf("你", "好", "Kotlin")
    //遍历数组
    for(item:String in array_string){
        println(item)
    }
    for(i in array_string.indices){
        println("array[$i] = ${array_string[i]}")
    }
}