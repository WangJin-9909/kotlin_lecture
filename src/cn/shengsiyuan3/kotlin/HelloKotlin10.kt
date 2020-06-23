package com.shengsiyuan3.kotlin

fun main(args: Array<String>) {
    //不使用转义字符
    var a: String = "hello \n hello"
    println(a)
    //使用转移字符
    var b:String = "hello\\n hello"
    println(b)
    //使用""" """（3个双引号输出内容）
    var c:String = """ fjlkdsjfoiwur932509809248328409ur8
        |fsdlkjfdslkjfldsjfds
        |gdsjkgjdslkgjdsg
        |\\\\\\\\\\\|||||4w7561\\\/...,.,,.,.,.````\\\`\`\\`\'`];][\][.;';,,/.,/.]\]`\];]]`,';,`!@#$%^&*()!@#$%^&*()_\\\\\/\;\\pp;]p\;\op;][+_)*^$#!@#$%~!@#$%^&*()_+_)(&^%$#@!~!@#$%^&*()""".trimMargin()
    println(c)
}