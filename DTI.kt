data class Customer(val name: String, val email: String)

//filter
val customers = list.filter { it.name.startsWith("A") }
val customers = list.filterNot { it.name.startsWith("A") }
 
val customers = list.filter{x -> x > 2}
val positives = list.filter{ it > 0 }

if("123" in emaillist){
    。。。
}

if ("456" in emaillist){
    。。。
}
//延迟属性
val p:String by lazy { //该值仅在首次访问时计算
    。。。
}

//创建单例
object Resource {
    val name = "Name"
}

//实例化一个抽象类
abstract class AbstractClass {
    abstract fun abstractMethod()
    abstract fun doSomething()
}

fun main() {
    val myObject = object : AbstractClass() {
        override fun abstractMethod() {
            //实现抽象方法
        }
        override fun doSomething() {
            //实现抽象方法
        }
    }
    myObject.abstractMethod()
} 