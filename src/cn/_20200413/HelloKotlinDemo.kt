package com._20200413

fun main(args: Array<String>) {
    println(convert2Uppercase("1235nnmv789"))
}

fun test_1() {
    //1.定义一个String集合
    val list: List<String> = listOf("hello", "wordl", "hello world")
    //2.对集合进行遍历
    for (str in list) {
        println("str = " + str)
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun convert2Uppercase(str:Any):String?{
    if(str is String){
        return str.toUpperCase()
    }
    return null
}

fun test_3(){
    for(i in 2..10 step 2){}
    for(i in 2.rangeTo(20).step(3)){}
    for(i in 10.downTo(1) step 3){}
}