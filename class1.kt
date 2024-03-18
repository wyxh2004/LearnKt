//在 Kotlin 中所有类都有一个共同的超类 Any，对于没有超类型声明的类它是默认超类
class Example //从 Any 隐式继承
//Any类默认有三个方法，equals()，hashcode()，toString()
//  默认情况下，kotlin类是final的，也就是说，不能被继承
//  但是，可以使用open关键字声明一个类为open的

open class Base(p: Int) {
    //this class is open to be inherited
}
//声明一个显式的超类型
class Derived(p: Int) : Base(p) {
    //this class is final
}

/**
 * 如果派生类有一个主构造函数，则基类必须在主构造函数中根据参数对其初始化
 * 如果派生类没有主构造函数，那么每个次构造函数必须使用super关键字初始其基类型，
 * 或者委托给另一个做到这点的构造函数。请注意，在这种情况下，不同的次构造函数
 * 可以调用基类的不同的构造函数
 */

class MyView : View {
    //次构造函数用constructor关键字定义

    constructor (ctx: Context): super(ctx)

    constructor (ctx: Context, attrs: AttributeSet): super(ctx, attrs)

    init {
        //初始化代码
        println("MyView inited")
    }
}

//覆盖方法override  
open class Shape {
    open fun draw() {
        println("Shape draw")
    }
    fun fill ()
    open val area: Int = 1
}

class Circle(): Shape() { //括号可以省略
    override fun draw() {
        println("Circle draw")
    }
    //覆盖属性
    override val area: Int = 114514
}

//如果你想防止再次被覆盖，使用final关键字
class Rectangle(): Shape() {
    final override fun draw() {
        println("Final Rectangle draw")
    }
}

/**
 * 你也可以用一个 var 属性覆盖一个 val 属性，但反之则不行。 这是允许的，因为一个 val 属性本质上声明了一个 get 方法， 而将其覆盖为 var 只是在子类中额外声明一个 set 方法。
 */

//你可以在主构造函数中使用 override 关键字作为属性声明的一部分
interface Shape {
    val vertexCount: Int
}

class Rectangle(override val vertexCount: Int = 4): Shape 

class Polygon {
    override var vertexCount: Int = 0
        // set(value) {
        //     field = value
        //     println("Polygon vertexCount set to $value")
        // }
}   