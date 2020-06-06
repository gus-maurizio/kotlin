import java.time.Instant

data class Person(val name: String, val registered: Instant = Instant.now())

fun show(persons: List<Person>) {
    for ((name, date) in persons)
        println(name + "'s registration date: " + date)
}

fun <T> List<T>.length() = this.size
fun List<Int>.product(): Int = this.fold(1) { a, b -> a * b }

fun main(args: Array<String>) {
    val persons = listOf(Person("Mike"), Person("Paul"))
    val ints = listOf(1, 2, 3, 4, 5, 6, 7)
    val listLength = ints.length()
    val listProduct = ints.product()
    show(persons)
    println(listLength)
    println(listProduct)
}

