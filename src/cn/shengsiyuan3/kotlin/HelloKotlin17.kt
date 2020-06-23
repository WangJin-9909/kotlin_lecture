package com.shengsiyuan3.kotlin

//定义一个接口A
interface A {
    //定义一个接口中方法
    fun test_method()

    //定义一个有实现的接口方法
    fun method() {
        println("A")
    }
}

open class B {
    open fun method() {
        println("B")
    }
}

//实现接口A，继承父类B
class C : A, B() {
    override fun test_method() {
        println("test_method")
    }

    override fun method() {
        super<A>.method()
        println("override A")
    }

}


fun main(args: Array<String>) {
    val c = C()
    c.test_method()
    c.method()
}