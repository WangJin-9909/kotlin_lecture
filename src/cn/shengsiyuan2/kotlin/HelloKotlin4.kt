package com.shengsiyuan2.kotlin

fun main(args: Array<String>) {
    val i = convert2Int("abc")
    println("i = $i")
    printMultiply("10", "4")
}

fun convert2Int(str: String): Int? {
    try {
        //如果此处str不是Int类型的字符串，程序则会抛出异常
        return str.toInt()
    } catch (ex: Exception) {
        println("程序发生异常")
        return null
    }

}

fun printMultiply(a: String, b: String) {
    val aInt = convert2Int(a)
    val bInt = convert2Int(b)
    if (aInt != null && bInt != null) {
        println(aInt * bInt)
    } else {
        println("a or b is not a integer")
    }

}