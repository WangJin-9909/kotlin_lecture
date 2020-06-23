package com.shengsiyuan3.kotlin

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b
    fun substract(a: Int, b: Int) = a - b

}

fun ExtensionTest.multiply(a: Int, b: Int) = a * b

open class AA {

}

class BB : AA() {

}


fun AA.a() = "a"
//这里对覆盖扩展
fun BB.a() = "b"

fun myPrint(aa: AA) {
    println(aa.a())

}
//针对于类的同名函数扩展，优先执行类自己的函数
//可以使用，重载性值的扩展
class CC {
    fun foo() {
        println("member")
    }
}

fun CC.foo(i:Int) {
    println("member   2")
}


fun main(args: Array<String>) {
    var extensionTest = ExtensionTest()
    println(extensionTest.add(1, 3))
    println(extensionTest.substract(1, 3))
    println(extensionTest.multiply(3, 4))
    println("-----------------------------")
    var b = BB()
    println(b.a())
    println("----------------------------")
    println(myPrint(BB()))
    println("----------------------------")
    val c:CC = CC()
    c.foo()
    c.foo(1)

}