package com.shengsiyuan2.kotlin

/*
1.一个类可以有一个primary构造器和一个或多个secondary构造器
2.与Java不同的是，Kotlin是要把构造器参数写在类名后面
3.主构造方法如果没有注解和可见性修饰符的话，关键词constract可以省略
4.主构造方法中不能有任何代码，只能有变量声明，构造方法实现应写在初始化代码块中
 */
class MyClass constructor(username:String){
    val username:String = username.toUpperCase()
}

fun main(args: Array<String>) {
    println(MyClass("wangJin").username)
}