package com.shengsiyuan3.kotlin

//伴生对象的扩展
class CompanionObjectExtension{
    companion object MyObject{

    }
}

fun CompanionObjectExtension.MyObject.method(){
    println("------------------------")
}

fun main(args: Array<String>) {
    CompanionObjectExtension.method()
}