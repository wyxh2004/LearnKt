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
    
// 接口中的属性
interface MyInterface {
    var prop: String // 抽象的，必须在实现类中提供具体实现
    var myProperty: String
    var myProperty2: String
    
    get() = "foo"
    
    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override var myProperty: String = ""
}

//接口继承：一个接口可以从其他接口派生，意味着既能提供基类成员的实现也能声明新的函数和属性。
interface Named {
    val name : String // abstract
}

interface Person : Named { // interface Person 继承接口 Named
    val age : Int // abstract
    val firstname : String
    val lastname : String

    override val name : String get() = "$firstname $lastname"

}

data class Employee {
    //不必实现“name”
    override val age : Int
    override val firstname : String
    override val lastname : String
    val position: Position
}: Person

//解决覆盖冲突
//实现多个接口时，可能遇到同一个方法继承多个实现的问题
interface A {
    fun foo() {
        println("A")
    }
    fun bar()
}

interface B {
    fun foo() {
        println("foo:B")
    }
    fun bar() {
        println("bar:B")
    }
}

class C : A {
    override fun bar() {
        print("bar:C extend A")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo() //super 关键字在 Kotlin 中主要用于处理继承关系，帮助子类精确地调用或访问父类的相关元素。尤其在多重继承或接口实现等可能产生二义性的情况下，Kotlin 提供了明确指定父类来源的能力
        super<B>.foo()
    }

    override fun bar () {
        super<B>.bar()
    }
}

/**
 * 上例中，接口 A 和 B 都定义了方法 foo() 和 bar()。 两者都实现了 foo(), 但是只有 B 实现了 bar() (bar() 在 A 中没有标记为抽象， 因为在接口中没有方法体时默认为抽象）。 现在，如果实现 A 的一个具体类 C，那么必须要重写 bar() 并实现这个抽象方法。
 */

 /**
  * 然而，如果从 A 和 B 派生 D，需要实现从多个接口继承的所有方法，并指明 D 应该如何实现它们。这一规则既适用于继承单个实现（bar()）的方法也适用于继承多个实现（foo()）的方法。
  */