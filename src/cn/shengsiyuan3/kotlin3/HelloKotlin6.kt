package com.shengsiyuan3.kotlin3

//对象表达式 object express
//Java中的匿名内部类
/*
对象表达式样式：
  object ：[父类型1， 父类型2]{

  }
 */
//定义一个接口
interface MyInterface {
    fun myPrint(i: Int)
}

//定义一个抽象类
abstract class MyAbstractClass {
    abstract val age: Int
    abstract fun printMyAbstractClassInfo()
}

fun main(args: Array<String>) {
    //定义一个对象表达式     实现接口，   继承抽象类
    var myObject = object : MyInterface, MyAbstractClass() {
        init {
            println("对象表达式1  执行")
        }

        override fun printMyAbstractClassInfo() {
            println("实现了抽象类的方法")
        }

        override val age: Int
            get() = 10

        override fun myPrint(i: Int) {
            println("实现了接口的方法 i = ${i}")
        }

    }
    myObject.printMyAbstractClassInfo()
    myObject.myPrint(10)
    //定义第二个对象表达式
    var myObj2 = object {
        init {
            println("对象表达式2  执行")
        }
    }
}


