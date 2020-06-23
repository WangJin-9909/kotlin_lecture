package com.shengsiyuan3.kotlin3

class OuterClass5 {
    inner class InnerClass5(str: String) {
        init {
            println("str = ${str}")
        }
    }
}

/*
创建内部类对象
 */
fun main(args: Array<String>) {
    var inner: OuterClass5.InnerClass5 = OuterClass5().InnerClass5("hello")
}