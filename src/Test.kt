class Person {
    var age: Int = 18
        set(value) {
            if (value > 0 && value < 110) {
                field = value
            }
        }
}

fun main() {
//    val person = Person()
//
//    println(person.age) // 18
//    person.age = 45
//    println(person.age) // 45
//    person.age = -345
//    println(person.age) // 45 (не изменилось из-за проверки в setter)

}