class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyaddress(address: Address) {
    val newAddress = Address()
    newAddress.name = address.name
    newAddress.street = address.street
    newAddress.city = address.city
    newAddress.state = address.state
    newAddress.zip = address.zip

    return newAddress
}

//getter and setter

/**
 * 声明一个属性的完整语法如下：

var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]

    其初始器（initializer）、getter 和 setter 都是可选的。属性类型如果可以从初始器， 或其 getter 的返回值（如下文所示）中推断出来，也可以省略：
 */

var initialized = 1 // 类型 Int、默认 getter 和 setter
// var allByDefault // 错误：需要显式初始化器，隐含默认 getter 和 setter

//只读属性不允许 setter
val simple: Int? // 类型 Int、默认 getter、必须在构造函数中初始化
val inferredType = 1 // 类型 Int 、默认 getter

//为属性定义访问器
class Rectangle(val width: Int, val height: Int) {
    val area: Int // property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height
}

fun main() {
    val rectangle = Rectangle(3, 4)
    println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")
}

//如果可以从 getter 推断出属性类型，则可以省略它：  
val area get() = this.width * this.height

//如果定义了一个自定义的 setter，那么每次给属性赋值时都会调用它, except its initialization. 一个自定义的 setter 如下所示

var stringRepresentation: String
    get() = this.toString()
    set(value) {
        setDataFromString(value) // 解析字符串并赋值给其他属性
}//按照惯例，setter 参数的名称是 value

var setterVisibility: String = "abc"
    private set // 此 setter 是私有的
var setterAnnotation: Any ?= null
    @Inject set // 使用一个注解注入 setter