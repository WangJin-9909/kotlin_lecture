package com.shengsiyuan2.kotlin

fun main(args: Array<String>) {
    println(convert2Uppercase("Hello World"))
    println("-------------")
    println(convert2Uppercase(23456))
}

fun convert2Uppercase(str:Any):String?{
    if(str is String){
        return str.toUpperCase()
    }
    return null

}