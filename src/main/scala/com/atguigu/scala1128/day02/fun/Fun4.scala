package com.atguigu.scala1128.day02.fun

/**
 * Author atguigu
 * Date 2020/4/21 15:23
 */
object Fun4 {
    def main(args: Array[String]): Unit = {
        foo()
        def foo() = {
            println("main fooo")
        }
        
//        foo()
        
        
    }
    
    def foo(a: Int) = {
        var b = a
        b += 10
    }
}
