package com.shengsiyuan3.kotlin

//Kotlin学习资料在P6的



//如果类中没有任何内容，{}花括号可以省略
class EmptyClass

//不省略花括号的类定义
class Test {

}
//Kotlin中默认的类都是public的，且可以省略public，公有类不需要与文件名一致


//Kotlin中，有一个主构造方法或者多个从构造方法
//MyClass类有一个构造方法，构造方法写在类名的后面，属于声明的i部分,constructor关键字在没有任何注解或是可见性关键字修饰的情况下可以省略，构造方法不包含代码，需要在init代码块中
class MyClass constructor(username:String, password : String){//主构造器没有可见性修饰关键字，也没有注解，constructor可以省略
    init {
        println(username)
    }
}
//省略construct关键字的做法
class MyClass1(username: String){
    init {
        println(username)

    }
}

fun main(args: Array<String>) {
    //定义类对象,不需要new关键字
    var c = MyClass("example", "123456")
    var b = TestClass()
}

class TestClass{
    init {
        println("init .....")
    }
}