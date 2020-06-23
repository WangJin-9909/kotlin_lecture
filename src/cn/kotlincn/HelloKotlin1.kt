package com.kotlincn

//基本语法
//【函数】
/*
带有2个参数，返回Int的函数
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/*
将表达式作为函数体、返回值类型自动推断的函数
 */
fun sum_1(a: Int, b: Int) = a + b

/*
函数返回无意义的值
 */
fun printSum(a: Int, b: Int): Unit {
    println("sum of ${a} and ${b} is ${a + b}")
}

/*
Unit返回类型可以省略
 */
fun printSum_1(a: Int, b: Int) {
    println("sum of ${a} and ${b} is ${a + b}")
}

//【变量】
//定义只读局部变量使用关键字val定义。只能为其赋值一次
val a: Int = 1 //立即赋值
val b = 2 //自动推断处Int类型
//【条件表达式】
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//if用作表达式
fun maxOf_1(a: Int, b: Int) = if (a > b) a else b

//【空值与null检测】
//当某个变量的值可以为null的时候，必须在声明处的类型后添加?来表标识该印用可为空
//返回可可空值的函数
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    //注意parseInt()函数返回值为Int?
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    //直接使用 x * y可能导致错误，因为x或者y的值可能为null
    //println(x * y)
    if (x != null && y != null) {
        //在进行空值检测后，x和y执行到此处将自动转换为非空值
        println("s * y = ${x * y}")
    } else {
        println("arg1 or arg2 is not a Number")
    }

}

//【类型检测与自动类型转换】
//is运算符检测一个表达式是否某类型的一个实例。如果一个不可变的局部变量或属性已经检测除某类型，那么检测后的分支中可以直接当作该类型使用，无需显示转换
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        //obj在该条件分支内自动转换成String
        return obj.length
    }
    return null
}

//【for循环】
val items = listOf<String>("apple", "banana", "kiwifruit")

fun for_test_1() {
    for (item in items) {
        println(item)
    }
}

fun for_test_2() {
    println("indices = ${items.indices}")
    for (index in items.indices) {
        println("index = ${items[index]}")
    }
}

//【while循环】
fun while_test_1() {
    var index = 0
    while (index < items.size) {
        println(items[index])
        index++
    }
}

//【when表达式】
fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a  String"
            else -> "Unkonw"

        }

//【使用区间】
//使用in关键字检测某个数字是否在区间范围内
fun range_test_1() {
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("s is in 1..y+1")
    }
}

//检测某个数字是否不在指定区间外
fun test_range_2() {
    val list = listOf<String>("a", "b", "c")
    if(-1 !in 0..list.lastIndex){
        println("-1 is not ia range")
    }
}


fun main(args: Array<String>) {
    while_test_1()
    println(describe("Hello"))
}