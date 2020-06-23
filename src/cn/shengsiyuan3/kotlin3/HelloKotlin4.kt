package com.shengsiyuan3.kotlin3

class OuterClass4 {
    class NestedClass4 {
        init {
            println("NestedClass4构造块执行...")
        }
    }
}

fun main(args: Array<String>) {
    val o = OuterClass4()
    OuterClass4.NestedClass4()
}