package com.shengsiyuan3.kotlin

//定义一个类
class MyExtensionProperty

val MyExtensionProperty.name:String
    get(){
        return "Test"
    }


fun main(args: Array<String>) {
    //创建定义类的对象
    val m:MyExtensionProperty = MyExtensionProperty()
    //访问其属性
    println("m = " + m.name)
}