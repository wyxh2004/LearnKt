//派生类初始化顺序
open class BaseClass(val name: String) {
    init {
        println("BaseClass inited")
    }
    //第一步先完成基类的初始化
    open val size: Int = name.length.also { println("BaseClass size = $it")}
}

class Derived(name: String, val lastname: String): BaseClass(name.replaceFirstChar { it.uppercase()}.also { println("Derived inited $it")}){
    init {
        println("Derived initializer block")
    }
    override val size : Int = (super.size + lastname.length).also {
        println("Derived size = $it")
    }
}

fun main() {
    println("Creating Derived instance")
    Derived("hello", "world")
}
/**
 *  Creating Derived instance
 
    Derived inited Hello
    BaseClass inited
    BaseClass size = 5
    Derived initializer block
    Derived size = 10
 */


/**
 * 这意味着，基类构造函数执行时，派生类中声明或覆盖的属性都还没有初始化。
 * 在基类初始化逻辑中（直接或者通过另一个覆盖的 open 成员的实现间接）使用任何一个这种属性，都可能导致不正确的行为或运行时故障。
 *  设计一个基类时，应该避免在构造函数、属性初始化器或者 init 块中使用 open 成员。
 */


//调用超类(父类)实现：派生类中的代码可以使用 super 关键字调用其超类的函数与属性访问器的实现
open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle () {
    override fun draw() { 
        super.draw()  //调用超类(父类)实现
        println("Drawing a filled rectangle")
    }
    val fillColor: String get() = super.borderColor  //调用超类(父类)实现
}

//在一个内部类中访问外部类的超类，可以使用由外部类名限定的 super 关键字来实现：super@Outer
open class Round {
    open fun draw() { println("Drawing a round shape") }
    var borderColor: String  get() = "black" 
}

class filledRound : Round() {
    override fun draw() {
        var filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() { println("Filling with color $fillColor") }
        fun drawAndFill() {
            super@filledRound.draw()  //调用父类Round的draw实现
            fill()
            println("Drawing a filled round shape with color ${super@filledRound.borderColor }") //调用Round实现的borderColor的get()
        }
    }
}