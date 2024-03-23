//在 Kotlin 中，实现继承由下述规则规定：如果一个类从它的直接超类继承相同成员的多个实现， 它必须覆盖这个成员并提供其自己的实现（也许用继承来的其中之一）。

//如需表示采用从哪个超类型继承的实现，请使用由尖括号中超类型名限定的 super ，如 super<Base>：
open class Rectangle {
    open fun draw() { println("draw rectangle") }
}

interface Polygon {
    fun draw() { println("draw polygon")}  
    //接口成员默认就是“open”的
}

class Square() : Rectangle(), Polygon {
    // 编译器要求覆盖 draw()：
    override fun draw() {
        super<Rectangle>.draw() // 调用 Rectangle.draw()
        super<Polygon>.draw() // 调用 Polygon.draw()
    }
}

fun main () {
    var s = Square()
    s.draw()
}