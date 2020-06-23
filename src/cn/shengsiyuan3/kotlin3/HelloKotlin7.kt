package com.shengsiyuan3.kotlin3

/**
 * 对象表达式注意要点：
 * 匿名对象只能在局部变量范围内（也就是一个方法内）或是被private修饰得成员变量范围内才能被识别处其真正得类型
 */
class MyClass{
    //必须是private修饰符
    //将对象表达式赋值给成员变量
    private var myObj = object:T {
        override fun test() {
            println("test invoke")
        }

        fun output(){
            println("output invoke")
            //获取当前对象类型
            println("this = ${this.javaClass}")
            println("this = ${this::class.java}")
        }
    }

    //将对象表达式赋值给方法，即方法返回为对象表达式
    private fun method1() = object {
        val str = "hello"
    }


    private fun method2() = object {
        val str = "world"
    }

    fun test(){
        val str1 = method1().str
        val str2 = method2().str
        println(str1 + str2)
    }

    fun myTest(){
        myObj.output()
        val t:T = myObj
        t.test()
        //获取当前对象类型
        println(myObj.javaClass)
    }
}


fun main(args: Array<String>) {
    var myClass = MyClass()
    myClass.myTest()

    val any:Any = ""
    //获取当前对象类型
    println("any = ${any.javaClass}")

    println("--------------")
    myClass.test()
    println("++++++++++++++")
    println(MyClass::test)
    println(MyClass::class)
    println(MyClass::class.java)
    println(myClass.javaClass)
    println(MyClass::myTest)

}


interface T{
    fun test()
}