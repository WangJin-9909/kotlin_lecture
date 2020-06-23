package com.shengsiyuan3.kotlin3

class Person(val name: String, var age: Int) {
    private val str: String = "Person 属性"

    //内部类会持有外部类的引用
    private inner class PersonFeature(var height: Int, var weight: Int) {
        private val str: String = "PersonFeature属性"
        fun getPersonFeature() {
            val str: String = "局部变量"
            println("身高： ${height}  ,  体重：${weight}")
            this@Person.method()
            //访问局部变量
            println("${str}")
            //访问当前类(内部类)变量
            println("${this.str}")
            //访问外部类变量
            println("${this@Person.str}")
        }

    }

    private fun method() {
        println("执行了Person的method方法")
    }

    fun getPerson() {
        val personFeature = PersonFeature(120, 280)
        personFeature.getPersonFeature()
    }
}

fun main(args: Array<String>) {
    val person = Person("zhangsan", 20)
    person.getPerson()
}