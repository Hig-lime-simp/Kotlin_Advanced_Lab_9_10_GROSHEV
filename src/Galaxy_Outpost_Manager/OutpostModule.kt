package Galaxy_Outpost_Manager

abstract class OutpostModule(
    val name: String,
    var level: Int = 1
) {
    fun upgrade() {
        level++
        println("$name улучшен до уровня $level")
    }
    abstract fun performAction(manager: ResourceManager)
}