package com.shengsiyuan3.kotlin2

/*
数据类需要满足如下条件：
1.主构造方法至少要有一个参数
2.所有的主构造方法参数都需要标记为val或者var
3.数据类不能是抽象的、open的以及inner的

对于数据类，编译其会自动生成如下内容：
1.equals/hashCode对
2.toString()方法，具有固定的形式
3.按照属性的声明顺序

 */
//声明数据类,该数据类会生成默认构造方法
data class Person(val nsme: String, var age: Int, var address: String)

//声明数据类，需要生成无参构造方法，则提供默认值即可,该方法会生成很多构造方法，包含无参构造方法
data class Person2(var name: String = "name", var age: Int = 0, var address: String = "address")

fun main(args: Array<String>) {
    var person = Person("wangJin", 12, "BeiJing")
    //数据类自动重写了toString，去掉data关键字可发现区别
    println(person)
    //调用数据类的copy方法，注意需要传递要修改的参数
    var person2 = person.copy(address = "TianJin")
    println(person2)
    println("===================================")

    //解构
    var (name, age, address) = person
    println("name  = ${name}  age = ${age}  person = ${person}")

    println("===================================")
    var person2_2 = Person2()
    person2_2.name = "zhangda"
    person2_2.age = 10
    person2_2.address = "ShangHai"


}