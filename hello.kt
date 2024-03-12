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

    var programmingLanguages=Listof("Kotlin","Java","C++","C#","Python")
    println(programmingLanguages.size) // 5


    var fruits = mutableListOf("Apple","Banana","Mango","Orange","Pineapple")
    println(fruits.contains("Banana")) // true
    fruits.add("Pineapple")
    println(fruits) // [Apple, Banana, Mango, Orange, Pineapple]

    var colors = setOf("Red","Blue","Green","Yellow","Black")
    var newColors = mutableSetOf("Purple","Orange","White")
    
    println(colors.union(newColors)) // [Red, Blue, Green, Yellow, Black, Purple, Orange, White]
    println(colors.elementAt(0)) // Red
    println(colors.elementAt(10)) // IndexOutOfBoundsException
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
}
