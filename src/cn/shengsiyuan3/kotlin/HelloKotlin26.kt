package com.shengsiyuan3.kotlin

//被扩展的类，称为扩展接收者
class DD {
    fun method() {
        println("DD method")
    }
}

//扩展类在下面类中被扩展了，称为分发类
class EE {
    val instance = this
    fun method2() {
        println("EE method2")

    }

    fun DD.hello() {
        //使用扩展接收者的资源
        method()
        //使用分发接收者资源
        method2()
    }
    fun world(dd:DD){
        dd.hello()
    }

    fun a() {
        val d = DD()
        d.hello()
        d.output()
    }

    fun output(){
        val d = DD()
        println("-----")
        println(d.toString())
        println("-----")
        println(this.toString())
    }

    fun DD.output(){
        println("============")
        println(toString())
        println("============")
        println(this.toString())
        //下面2种方法相同，都是访问EE当前的toString()
        println("============")
        println(instance.toString())
        println("============")
        println(this@EE.toString())
    }




}

fun main(args: Array<String>) {
    val e:EE = EE()
    e.a()
    e.output()

}