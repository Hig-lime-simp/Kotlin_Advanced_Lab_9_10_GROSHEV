package example

object GameSession {
    init{
        println("Game session create")
    }
    var isActive: Boolean = false
    fun start(){
        isActive = true
        println("Game start")
    }
    fun end() {
        isActive = false
        println("Game closed")
    }
}
object Logger  {
    var count = 0

    fun log(messege: String){
        count++
        println("[$count] $messege")
    }
}
object  AppSettings{
    val version = "1.0.0"
    var isDarkMode = true

    fun toggleTheme() {
        isDarkMode = !isDarkMode
    }
}
fun checkTheme(){
    if (AppSettings.isDarkMode){
        println("Темная тема включена")
    }
}
object Colors{
    const val RED = "#FF0000"
    const val GREEN= "#00FF00"
    const val BLUE = "#0000FF"
}
fun main(){
//    println("Программа запущена")
//    println("Проверяем состояние, но не трогаем GameSession")
//    println("Теперь запускаем игру")
//    GameSession.start()
//    println("Проверяем состояние еще раз")
//    println("Активная сессия: ${GameSession.isActive}")
//    Logger.log("First messege")
//    Logger.log("Second messege")
//    val logger1 = Logger
//    val logger2 = Logger
//    println(logger1 == logger2)
//    println(Colors.RED)
//    println(Colors.GREEN)
//    println(Colors.BLUE)

    val  handle = object {
        val name = "Обработчик"
        fun handle(){
            println("Loading...")
        }
    }
    println(handle.name)
    handle.handle()
}