package com.shengsiyuan3.kotlin

class ThePersion(address: String, name: String) {
    val age: Int
        get() = 20
    var address: String = address
        get() {
            println("get invoke")
            return field
        }
        set(value) {
            println("set invoke")
            field = value
        }

     var name: String = name
        private set(value) {}
        get() {
            return field
        }

}

fun main(args: Array<String>) {
    var person = ThePersion("shangahi", "zhangsan")
    println(person.age)
    println("-------------------")
    println(person.address)
    person.address = "beijing"
    println(person.address)
    println("------------------")
    println(person.name)
  //  person.name = "lisi"
    println(person.name)

}