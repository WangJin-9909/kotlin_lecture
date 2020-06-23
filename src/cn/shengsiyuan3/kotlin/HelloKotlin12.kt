package com.shengsiyuan3.kotlin

//主构造器可以私有
class Person private constructor(username: String) {
    private var username: String
    private var age: Int
    private var address: String

    init {
        this.username = username
        this.age = 20
        this.address = "BeiJing"

    }

    //副构造方法写在类的body中，并且副构造方法必须直接或间接调用主构造方法
    //直接调用主构造器
    constructor(username: String, age: Int) : this(username) {
        this.username = username
        this.age = age
        this.address = "ShangHai"
    }

    //间接调用主构造器
    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = address
    }

    fun printInfo() {
        print("username = ${this.username}")
        print("   age = ${this.age}")
        print("   address = ${this.address}")
    }
}

fun main(args: Array<String>) {
    //使用主构造方法创建
    // var a = Person("example")
    //使用副1构造方法创建
    var b = Person("wangJin", 26)
    //使用副2构造方法创建
    var c = Person("wangJin", 26, "BeiJing")
    //println(a.printInfo())
    println(b.printInfo())
    println(c.printInfo())

}