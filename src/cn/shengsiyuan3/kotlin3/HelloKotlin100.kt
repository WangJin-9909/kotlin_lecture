package com.shengsiyuan3.kotlin3

class PersonOne{
    var name:String = ""
    var age:Int = 0
    companion object{

    }
}

fun main(args: Array<String>) {
    val person = PersonOne()
    println(PersonOne::class)
}