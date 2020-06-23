package com.shengsiyuan3.kotlin2

//泛型，表示变量类型的参数化
class MyGeneric<T>(t: T) {
    var variable: T

    init {
        this.variable = t
    }
}

fun main(args: Array<String>) {

    myTest(MyClass(1, "abc"))

}

//协变：生产者：泛型需要返回一个对象  out
//逆变：消费者，泛型需要吸收一个对象  in
class MyClass<out T, in M>(t: T, m: M) {
    private var t: T
    private var m: M

    init {
        this.t = t
        this.m = m

    }

    fun set(m: M) {
        this.m = m
    }

    fun get(): T = this.t
}

fun myTest(myClass: MyClass<Any, Any>) {
    var my: MyClass<Any, Any> = myClass
    println(my.get())
}