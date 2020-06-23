package com.shengsiyuan3.kotlin

open class BaseClass {
    open fun method() {

    }
}

abstract class ChildClass : BaseClass() {
    override abstract fun method()
}


class ChildImplClass : ChildClass() {
    override fun method() {
        println("ChildImplClass Implments")
    }

}
 fun test_method(){
    println("fsdjfdsjfds")
}
fun main(args: Array<String>) {
    val c = ChildImplClass()
    c.method()
}