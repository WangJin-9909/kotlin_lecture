package com.shengsiyuan3.kotlin

open class MyParent {
    //成员属性也可以重写
    open val name: String = "parnet"


}

class MyChild : MyParent() {
    //重写成员属性
    override val name: String = "child"
}


//定义类的时候直接重写父类成员属性
class MyChild2(override val name: String) : MyParent() {

}
//var 可以重写val  var是可读可写
//val 无法重写var  val是可读

open class MyParent3 {
    open val name: String get() = "parent"
    open fun method() {
        println("parnent  method")
    }
}

class MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("child3 method")
    }

    override val name: String get() = "child3"
}

fun main(args: Array<String>) {
    val mc = MyChild()
    println("my.name = ${mc.name}")
    println("----------------------")
    val mc2 = MyChild2("mc2")
    println("mc2.name = ${mc2.name}")
    println("-----------------------")
    val mc3 = MyChild3()
    mc3.method()


    println("mc3.name = ${mc3.name}")
}
