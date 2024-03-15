//源文件通常以包声明开头:

package org.example

fun printHello() {
    
}

class MyClass {
    
}

/**
 * 源文件所有内容（无论是类还是函数）都包含在该包内。 所以上例中 printMessage() 的全名是 org.example.printMessage， 而 Message 的全名是 org.example.Message。

如果没有指明包，该文件的内容属于无名字的默认包。

默认导入
有多个包会默认导入到每个 Kotlin 文件中：

kotlin.*
kotlin.annotation.*
kotlin.collections.*
kotlin.comparisons.*
kotlin.io.*
kotlin.ranges.*
kotlin.sequences.*
kotlin.text.*
根据目标平台还会导入额外的包：

JVM:

java.lang.*
kotlin.jvm.*
JS:

kotlin.js.*
 */

 //导入一个单个名称
 import org.example.printHello  // 现在 Message 可以不用限定符访问

// 也可以导入一个作用域下的所有内容：包、类、对象等:
import org.example.*  

//如果出现名字冲突，可以使用 as 关键字在本地重命名冲突项来消歧义：
import org.example.printMessage
import org.test.printMessage as testExample

/**
 * 顶层声明的可见性
如果顶层声明是 private 的，它是声明它的文件所私有的
 */