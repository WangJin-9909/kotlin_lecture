package com.shengsiyuan3.kotlin3

fun main(args: Array<String>) {
    var i = 10
    var myObj = object {
        fun method() {
            for (j in 1..20) {
                //不同于Java得匿名内部类，匿名对象可以修改外部变量，外部变量无需final修饰
                println(i++)
            }

        }
    }

    myObj.method()
}