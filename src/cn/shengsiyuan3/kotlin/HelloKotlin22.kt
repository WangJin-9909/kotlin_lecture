package com.shengsiyuan3.kotlin

//可见性：
//Kotlin提供了4种可见性：private protected internal public

//Java 默认修饰符为包级别，而Kotlin为public
//private 表示当前文件可用
//internal 表示在同一个模块下使用
//protected 不能修饰顶层函数、类
fun method(){}

open class Clazz{
    //子类不能访问
    private val b = 3
    //子类直接继承了，可以访问
    protected open val c = 4
    //属于同一个模块，可以访问
    internal val  d = 5

}

class subClazz:Clazz(){

}