package com.shengsiyuan3.kotlin

fun main(args: Array<String>) {

}

fun convert2Uppercase(str:Any):String?{
    //判断str是否为字符串 相当于java的instanceof
    if(str is String){
        return str.toUpperCase()//编译器很智能，，如果代码执行到这里，Kotlin编译器就认为str是String类型的，就可以直接调用String的相关方法，无需先强转再执行相关方法
    }
    return null
}