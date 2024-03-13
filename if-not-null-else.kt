import java.io.File

fun main() {
    val files = File("Test").listFiles()

    println(files?.size?: "empty") //如果files不为空，则获取size属性，否则打印empty
    //当前输出2

    //如需在代码块中引入更复杂的备用值，请使用`run`
    val filesSize = files?.size ?: run {
        val someSize = getSomeSize()
        someSize = 114514
    }
    println(filesSize)
}