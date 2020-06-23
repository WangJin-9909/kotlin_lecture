package com.shengsiyuan3.kotlin

fun main(args: Array<String>) {
    println(sum(2, 3))
    println(sum2(3,4))
    test_01()
    test_02()
    printMultiply("2", "5")
    printMultiply("2", "t")
}

fun sum(a:Int, b:Int):Int{
    return a +  b
}

/**
 * 函数定义新特性
 */
fun sum2(a:Int, b:Int) = a + b

/**
 *********************************返回值自动推导
 */
fun test_01(){
    var x = 10
    var y = 20
    var max = if(x > y) x else y
    var min = if(x > y) y else x
    println("max =  ${max}  min  = ${min}")
}
fun  test_02(){
    var  x = 10
    var y  = 20

    var max = if(x > y){
        println("x > y")
        x
    }else{
        println("x < y")
        y
    }
    println("max =  ${max}")
}

/**
 * 将字符串转换为整数
 */
fun stringToInt(str:String):Int?{
    try {
        return str.toInt()
    }catch (e: Exception ){
        e.toString()
    }

    return null
}

fun printMultiply(a:String, b:String){
    val a2Int = stringToInt(a)
    val b2Int = stringToInt(b)

    //println(a2Int * b2Int)

    println(a2Int is Int?)


    if(null != a2Int && null != b2Int){
        println(a2Int * b2Int)
    }else{
        println("param not int")

    }
}








