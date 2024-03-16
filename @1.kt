//作为注解annotation的前缀
//注解是一种元数据，他能被编译器或者运行时环境被解析，用来提供附加信息或指导程序的行为

//1.编译时注解
@JvmOverload
fun main(args: Array<String>) {
    val name = "hello"
    println(name)
}

@Deprecated("use new function instead")
fun oldFunction() {
    //...
}