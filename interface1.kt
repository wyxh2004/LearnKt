//Kotlin 的接口可以既包含抽象方法的声明也包含实现。与抽象类不同的是，接口无法保存状态。它可以有属性但必须声明为抽象或提供访问器实现。
interface MyInterface {
    fun bar()
    fun boo() {
        // 可选的方法体
    }
}

//实现接口：一个类或者对象可以实现一个或多个接口
class Child : MyInterface {
    override fun bar() {
        //   方法体
    }
}
    
