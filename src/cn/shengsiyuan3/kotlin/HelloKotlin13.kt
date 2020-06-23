package com.shengsiyuan3.kotlin

class Student(private var username:String,  private val age:Int, private val address:String){
    fun printInfo(){
        println("username : ${username}  age: ${age}  address : ${address}")
    }

}


fun main(args: Array<String>) {
    val student = Student("zhagnsan", 12, "BeiJing")
    student.printInfo()
}