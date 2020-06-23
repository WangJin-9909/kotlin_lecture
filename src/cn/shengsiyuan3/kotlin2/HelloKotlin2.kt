package com.shengsiyuan3.kotlin2

/*
    密封类：
    1.密封类用于表现受限的层次结构
    2.密封类必须定义在同一个文件种
    3.密封类是私有构造器，不允许有实例
 */

sealed class Calculator

class Add:Calculator()
class Substract:Calculator()

fun calculate(a:Int, b:Int, cal:Calculator) = when(cal){
    is Add -> a + b
    is Substract -> a - b
}

fun main(args: Array<String>) {
    println(calculate(1, 2, Add()))
    println(calculate(2, 3, Substract()))
}