package modules

import resources.ResourceManager
class ResearchLab : OutpostModule(name = "Исследовательская лаборатория") {
    override fun performAction(manager: ResourceManager) : ModuleResult {
        val minerals = manager.get("Minerals")

        if (minerals == null || minerals.amount < 30) {
            println("Недостаточно минералов для исследования")
            return ModuleResult.NotEnoughResourses(
                resourseName = "Minerals",
                required = 30,
                avaible = minerals?.amount ?: 0
            )
        }

        minerals.amount -= 30
        return ModuleResult.Succes("исследование завершено")
    }
}