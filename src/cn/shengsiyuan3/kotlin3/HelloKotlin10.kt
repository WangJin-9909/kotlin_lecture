package com.shengsiyuan3.kotlin3

//定义一个枚举
enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

//枚举接受参数
enum class Season2(val temp: Int) {
    SPRING(10), SUMMER(20), AUTUMN(30), WINTER(40)
}

//枚举中声明方法
//1.声明抽象方法
//2.声明的枚举元素需要实现抽象方法
enum class Season3 {
    SPRING {
        override fun getTest(l: Int) {

        }

        override fun getTest() {
            println("枚举中的方法实现")
        }

        override fun getSeason(): Season3 {
            return SPRING
        }

    },
    SUMMER {
        override fun getTest(l: Int) {

        }

        override fun getTest() {

        }

        override fun getSeason(): Season3 {
            return SUMMER
        }

    };

    abstract fun getSeason(): Season3
    abstract fun getTest()
    abstract fun getTest(l:Int)

}


fun main(args: Array<String>) {
    //获取枚举里的所有属性
    val season = Season2.values()
    //这里与Java不同，Lambda表达式不需要()
    season.forEach { season2: Season2 -> println(season2) }
    //使用it实现
    season.forEach { println(it) }
    for(item in season){
        println("item = ${item}")
    }
    println("--------------------------------")
    val season_2 = Season3.values()
    for(item in season_2){
        println("season = ${item}")
    }
}