fun transform (color: String): Int{
    return when(color){
        "red" -> 0
        "green" -> 1
        "blue" -> 2
        else -> throw IllegalArgumentException("Unknown color: $color")
    }
}