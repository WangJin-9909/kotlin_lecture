package com.shengsiyuan3.kotlin

/**
 * 延迟初始化
 */
class TheClass{
    lateinit  var name:String
    init{
        this.name = "zhangsan"
    }

    fun print(){
        println("name = ${name}")
    }
}

fun main(array: Array<String>){
    var a = TheClass()
    //a.init()
    a.print()
}