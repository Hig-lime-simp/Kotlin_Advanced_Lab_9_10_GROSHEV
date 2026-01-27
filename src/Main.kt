import example.Messneger
import modules.ResearchLab
import modules.EnergyGenerator
import modules.ModuleResult
import resources.OutpostResource
import resources.ResourceManager
fun handleModuleResult(result: ModuleResult){
    when (result){
        is ModuleResult.Succes -> println("Succes ${result.messege}")
        is ModuleResult.ResourseProduced -> println("Maiden: ${result.resoursename} + ${result.amount}")
        is ModuleResult.NotEnoughResourses ->  println("You dont have ${result.resourseName}." +
                "Need ${result.required}, have: ${result.avaible}")
        is ModuleResult.Error -> println("ERROE: ${result.reason}")
    }
}
object SystemLogger{
    init {
        println("SystemLogger инициализация")
    }

    fun log(message: String){
        println("[LOG] $message")
    }
}
val logger by lazy {
    SystemLogger
}
fun main() {
    val manager = ResourceManager()
    val minerals = OutpostResource(id = 1, name = "Minerals", amountInit = 300)
    val gas = OutpostResource(id = 2, name = "Gas", amountInit = 100)
//
//    manager.add(minerals)
//    manager.add(gas)
//    manager.printAll()
//
//    val bonus = minerals.copy(amount = minerals.amount + 50)
//    println("Копия минералов с бонусом: $bonus")

    manager.add(OutpostResource(id = 1, name = "Minerals", amountInit = 120))
    manager.add(OutpostResource(id = 2, name = "Gas", amountInit = 40))

    val generator = EnergyGenerator()
    val lab = ResearchLab()

    val geenratorResult = generator.performAction(manager)
    val labResult = lab.performAction(manager)

    handleModuleResult(geenratorResult)
    handleModuleResult(labResult)

    println()
    manager.printAll()

    logger.log("Запуск базы")


}