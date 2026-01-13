package exs_7

class Person(name: String) : Human(name) {
    override var age: Int = 1
    override fun hello() {
        println("My name is $name")
    }
}
data class Item(
    val id: Int,
    val name: String,
    val quantity: Int
){
    override fun toString(): String {
        return "Id предмета: $id\nИмя: $name\nКоличество: $quantity\n"
    }
}
abstract class Human(val name: String) {
    abstract var age: Int
    abstract fun hello()
}

fun main() {
//    val person = exs_7.Person()
//
//    println(person.age) // 18
//    person.age = 45
//    println(person.age) // 45
//    person.age = -345
//    println(person.age) // 45 (не изменилось из-за проверки в setter)
//val sword = Item(id = 1, name = "Sword", quantity = 1)
//val betterSword = sword.copy(quantity = 2)
//println(sword.toString())
//println(betterSword.toString())
//val (id, name, quantity) = betterSword
//println("Id предмета: $id\nИмя: $name\nКоличество: $quantity\n")

}