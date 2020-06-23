package com.shengsiyuan3.kotlin3

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

fun main(args: Array<String>) {
    val jFrame = JFrame("kotlin 调用 JFrame")
    jFrame.addWindowListener(object : WindowListener {
        override fun windowDeiconified(e: WindowEvent?) {
            println("windowDeiconified")
        }

        override fun windowClosing(e: WindowEvent?) {
            println("windowClosing")
        }

        override fun windowClosed(e: WindowEvent?) {
            println("windowClosed")
        }

        override fun windowDeactivated(e: WindowEvent?) {
            println("windowDeactivated")
        }

        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowIconified(e: WindowEvent?) {
            println("windowIconified")
        }

        override fun windowActivated(e: WindowEvent?) {
            println("windowActivated")
        }

    })

    val jButton = JButton("Start")
    //使用函数式接口,然后类型也可以省略ActionListener

    jButton.addActionListener({ println("添加监听第一种，不带参数") })
    jButton.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            println("添加监听第二种，带参数")
        }
    })
    //为什么下面的方法不执行呢
    jButton.addActionListener { e: ActionEvent? ->
        {
            println("添加监听第三种，带参数  ${e.toString()}")
        }
    }

    jButton.addActionListener { e ->
        {
            println("添加监听第四种，带参数  ${e.toString()}")
        }
    }
    val a = "fsfds"
    val listener:ActionListener = ActionListener { println("hello world") }
    val listener_1 = ActionListener { e: ActionEvent? -> {} }

    println(listener.javaClass)
    println(a.javaClass)
    println(listener.javaClass.superclass)
    println(listener::class.java)
    println(listener::class.java.superclass)



    jFrame.add(jButton)
    jFrame.pack()
    jFrame.isVisible = true
    jFrame.setBounds(100, 100, 500, 400)
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE


}