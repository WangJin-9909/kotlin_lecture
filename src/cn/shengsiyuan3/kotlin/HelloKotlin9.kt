package com.shengsiyuan3.kotlin

fun main(args: Array<String>) {
    //String集合
    var list_string = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")
    for (i in list_string) {
        print("  i = ${i}  ${i.length}")

    }
    println()
    //筛选出字母大于5的元素，进行大写钻换,然后排序，然后打印,，演示函数式编程
    list_string.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }
    println()
    //字符串包含
    if("hello" in list_string){
        println("hello is in lsit_string")
    }
    println()
    var list_int = listOf<Int>(1, 2, 3, 4, 5, 6)
    for(i in list_int){
        print("  i = ${i}")
    }
    println()
    var list_char = listOf<Char>('a', 'b', 'g', 'i')
    for(i in list_char){
        print("  i = ${i}")
    }
    println()
    var list_data:ArrayList<Data> = arrayListOf<Data>()
    list_data.add(Data("example", "fangshan"))
    list_data.add(Data("zhangdan", "haidian"))
    list_data.add(Data("lisi", "dongcheng"))
    for (i in list_data){
        println("i = ${i}")
    }



}


data class Data(var name: String, var location: String)
