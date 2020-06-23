package com.shengsiyuan3.kotlin3

/*
嵌套类：
 */
class OuterClass{
    private val str:String = "hello world"
    class NestedClass{
        fun nestedMethod(){
            println("welcome")

        }
    }
}

fun main(args: Array<String>) {
    //创建嵌套类对象
    val n = OuterClass.NestedClass()

    n.nestedMethod()
}