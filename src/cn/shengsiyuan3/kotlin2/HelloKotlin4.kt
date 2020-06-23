package com.shengsiyuan3.kotlin2

import kotlin.test.assertTrue

//Invariant不变
class ParameterizedClass<A>(private val value: A) {
    fun getValueA(): A {
        return this.value
    }
}

//协变：生产者  out
class ParameterizedProducer<out T>(private val value: T) {
    fun getValue(): T {
        return this.value
    }
}

//逆变：消费者  in
class ParameterizedConsumer<in T>(private var value: T) {
    fun setValue(v: T) {
        this.value = v
    }
}

fun main(args: Array<String>) {
    val p1 = ParameterizedClass("hello world")
    val v1 = p1.getValueA()
    println("v1 = ${v1}")
    assertTrue { v1 is String }

    println("------------")
    val p2 = ParameterizedProducer("hello world")
    //将子类型的赋值给父类型，这属于协变
    val p2_2: ParameterizedProducer<Any> = p2


    val p3  = ParameterizedConsumer<Number>(1)
    //将父类型赋值给子类型
    val p3_2:ParameterizedConsumer<Int> = p3

}
