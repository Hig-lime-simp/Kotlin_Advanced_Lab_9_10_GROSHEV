package example

import kotlin.properties.Delegates

class UserProfile(initaialName: String, initaialEmail: String){
    var name: String by Delegates.observable(initaialName) {
        _, old, new ->
        println("Имя изменено '$old' - > '$new'")
    }
    var email: String by Delegates.observable(initaialEmail){
        _, old, new ->
        println("Email обновилось '$old' -> '$new'")
    }
    val avatar: String by lazy {
        println("Загружаем аватар для $name...")
        "avatar_of_$name.png"
    }
}

fun main(){
    println("Create user profile")
    val user = UserProfile("Алиса", "alice@example.com")

    println(user.name)
    println(user.email)

    println(user.avatar)

    println(user.avatar)

    user.email = "example@mal.com"

    user.name = "Алиса К."
}