fun main (){
    println("Hello, World!")
    
    var morning = true

    if (morning) {
        println("Rise and shine!")
    }
    // Print: Rise and shine!
    var grade = "A"
    when (grade) {
        "A" -> println("Excellent!")
        "B" -> println("Good job!")
        "C" -> println("You passed!")
        else -> println("You failed!")
    }
    var height = 46
    if(height in 1..50){
        println("You are within the range")
    }

    var programmingLanguages = listOf("Kotlin","Java","C++","C#","Python")
    println(programmingLanguages.size) // 5


    var fruits = mutableListOf("Apple","Banana","Mango","Orange","Pineapple")
    println(fruits.contains("Banana")) // true
    fruits.add("Pineapple")
    println(fruits) // [Apple, Banana, Mango, Orange, Pineapple]

    var colors = setOf("Red","Blue","Green","Yellow","Black")
    var newColors = mutableSetOf("Purple","Orange","White")
    
    println(colors.union(newColors)) // [Red, Blue, Green, Yellow, Black, Purple, Orange, White]
    println(colors.elementAt(0)) // Red
    // println(colors.elementAt(10)) // IndexOutOfBoundsException
    println(colors.elementAtOrNull(10)) // null

    var average = mapOf("John" to 3.2, "Jane" to 2.8, "Jack" to 4.0)
    var vegetables = mutableMapOf("Carrot" to 1, "Potato" to 2, "Tomato" to 3)

    println(average.keys) // [John, Jane, Jack]
    println(vegetables.values) // [1, 2, 3]
    println(vegetables.containsKey("Carrot")) // true
    println(average["John"]) // 3.2
    vegetables.put("Cucumber", 10) 
    vegetables.remove("Carrot")
    println(vegetables) // {Potato=2, Tomato=3, Cucumber=10

    //lambda expression
    var getdiff = {num1: Int, num2: Int -> num1 - num2}
    println(getdiff(10,5)) // 5
}

class Student {
    var name: String = ""
    var age: Int = 0
    var grade: Int = 0
}

fun main2() {
    var student = Student()

    println(student.name)
    student.name = "John"
    println(student.name)
    student.age = 18
    println(student.age)
    student.grade = 10
    println(student.grade)
}

class Student2(val name: String, val age: Int, val grade: Int)

fun main3(){
    var student = Student2("John", 18, 100)
    println(student.name)
    println(student.age)
    println(student.grade)
}

class Student3(var name: String, var age: Int, var grade: Double) {
    init{
        println("Student3 $name constructor called, has ${grade - 100} grades.")
    }
}

fun main4(){
    var student = Student3("John", 18, 100.0) // Student3 John constructor called, has 0 grades.
}

class Student4(var name: String, var age: Int, var grade: Double) {
    init{
        println("Student4 $name constructor called, has ${grade - 100} grades.")
    }
    fun calc():String{
        return when{
            grade > 90 -> "Excellent"
            grade > 80 -> "Good"
            grade > 70 -> "Average"
            grade > 60 -> "Below Average"
            else -> "Fail"
        }
    }
}

fun main5(){
    var student = Student4("John", 18, 85.0)
    println("${student.name} has ${student.calc()} grades.}")
    // John has Good grades.
}