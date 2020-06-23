package com.shengsiyuan3.kotlin

//Kotlin中，默认类是无法被继承的，只有加open关键字修饰后，才会被继承
open class Parent(name: String, age: Int) {

}

//创建Parent类的子类
class Child(name: String, age: Int) : Parent(name, age) {

}

open class Parent2(name: String) {

}
//在Lotlin中，如果一个类没有primary构造方法，那么这个类的每个secondeary构造方法就需要通过super关键字来初始化父
//类型，或是通过其它secondary构造方法完成这个任务
class Child2 : Parent2 {
    constructor(name: String) : super(name) {

    }
}