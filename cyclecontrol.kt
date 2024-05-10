
import java.time.LocalTime

fun main() {
    val startTime = LocalTime.of(6, 0)
    val endTime = LocalTime.of(22, 0)
    val currentTime = LocalTime.now()
    if (currentTime.isBefore(startTime) || currentTime.isAfter(endTime)) {
        println("this is not working hours.")
    } else {
        println("this is working hours.")
    }
    var list = (1..20).toList()
    println(list.listIterator().next())
    println(list[0])
    for (i in list.indices) {
        println(list[i])
    }
    println(list.size)

    for (i in iterable) {
            
    }
}
