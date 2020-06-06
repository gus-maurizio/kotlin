import java.time.Instant

data class Person(val name: String, val registered: Instant = Instant.now())

fun show(persons: List<Person>) {
    for ((name, date) in persons)
        println(name + "'s registration date: " + date)
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Mike"), Person("Paul"))
    show(persons)
}

