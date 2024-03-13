import java.io.File

// if - not -null 缩写
fun main() {
    val files = File("Test").listFiles()
    println(files?.size) // 如果files不是null，则获取size属性
    //当前输出2
}