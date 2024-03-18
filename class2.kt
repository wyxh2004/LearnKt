//派生类初始化顺序
open class BaseClass(val name: String) {
    init {
        println("BaseClass inited")
    }
    open fun baseClassFunction() {
        println("BaseClass baseClassFunction()")
    }
    open val size: Int = name.length.also { println("BaseClass size = $it")
}