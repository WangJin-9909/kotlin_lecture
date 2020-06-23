package com.shengsiyuan3.kotlin3

/*
内部类
 */
class OuterClass2{
    private var str:String = "hello world"
    inner class InnerClass{
        fun innerMethod() = this@OuterClass2.str
    }
    //局部内部类
    fun getNmee():String{
        class LocalNestedClass{
            val name:String = "myTest"
        }

        val localNestedClass:LocalNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}

fun main(args: Array<String>) {
    println(OuterClass2().InnerClass().innerMethod())
    println(OuterClass2().getNmee())
}