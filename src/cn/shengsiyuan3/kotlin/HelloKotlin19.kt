package com.shengsiyuan3.kotlin

//object关键字：对象声明
//声明一个对象，该对象可以拥有属性、方法、并且是以单例模式存在的
//该对象的类是谁呢？
object MyObject {
    fun method() {
        println("MyObiect...")
    }
}

object ObjectInstance {
    fun test_1() {
        println("test_1")
    }

    fun test_2() {
        println("test_2")
    }

    fun test_3() {
        println("test_3")
    }
}
//companion object:伴生对象
//再Kotli中，与Java不同的是，类是没有static方法的
//在大多数情况下，Kotlin推荐的做法是使用包级别的函数来作为静态方法


class MyTest{
    //该对象伴生MyTest类存在
    companion object MyObject{
        @JvmStatic
        val a:Int = 100
        @JvmStatic
        fun method(){
            println("companion object  method()")
        }

    }
}

fun main(args: Array<String>) {
    //直接调用其方法
    MyObject.method()
    ObjectInstance.test_1()
    ObjectInstance.test_2().toString()
    ObjectInstance.test_3()
    test_method()
    println("------------------")
    MyTest.MyObject.method()
    MyTest.method()

}