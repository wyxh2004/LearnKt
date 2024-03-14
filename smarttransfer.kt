// 大多数场景都不需要在	Kotlin	中使用显式转换操作符，因为编译器跟踪不可变值的 is检测 以及显式转换，并在必要时自动插入（安全的）转换

fun demo() {
    if (x is String){
        println(x.length) // x 自动转换成字符串
    }
}

fun demo2() {
    if (x !is String) 
        return 
    else 
        println(x.length) // x 自动转换成字符串
}

fun demo3() {
    // || 右侧的 x 自动转换成字符串
    if (x != String || x.length == 0) 
        return
    // 右侧的 x 自动转换成字符串
    if (x is String && x.length == 0)
        print(x.length) // x 自动转换成字符串        
}

// 智能转换用于when表达式和while循环也一样：
fun demo4() {
    when (x){
        is Int -> print(x+1)
        is String -> print(x.length+1)
        is IntArray -> print(x.sum())
        is StringArray -> print(x.joinToString(","))
    }
}