package com.shengsiyuan3.kotlin

open class Fruit {
    //方法会被重写
    open fun name() {
        println(" fruit ")
    }

    //方法会被继承
    fun expirationDate() {
        println("1 month")
    }
}

class Apple : Fruit() {
    override fun name() {
        super.name()
        println(" apple ")
    }
}

open class Orange : Fruit() {
    //禁止子类重写
     final override fun name() {
        super.name()
        println("orange")
    }

}

open class BigOrange:Orange(){
    //父类方法加上final关键字后，就没法重写了
    /*override fun name() {
        super.name()
        println("Big Orange")
    }*/
}


fun main(args: Array<String>) {
    println("---------------------")
    val a = Apple()
    a.name()
    a.expirationDate()
    println("---------------------")
    val o = Orange()
    o.name()
    o.expirationDate()
    println("---------------------")
    val  bo = BigOrange()
    bo.name()

}