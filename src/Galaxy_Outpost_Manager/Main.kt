package Galaxy_Outpost_Manager

fun main() {
    val manager = ResourceManager()
    val minerals = OutpostResource(id = 1, name = "Minerals", amount = 300)
    val gas = OutpostResource(id = 2, name = "Gas", amount = 100)
//
//    manager.add(minerals)
//    manager.add(gas)
//    manager.printAll()
//
//    val bonus = minerals.copy(amount = minerals.amount + 50)
//    println("Копия минералов с бонусом: $bonus")

    manager.add(OutpostResource(id = 1, name = "Minerals", amount = 120))
    manager.add(OutpostResource(id = 2, name = "Gas", amount = 40))

    val generator = EnergyGenerator()
    val lab = ResearchLab()

    generator.performAction(manager)
    lab.performAction(manager)

    println()
    manager.printAll()
}