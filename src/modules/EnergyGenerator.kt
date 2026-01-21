package modules

import resources.OutpostResource
import resources.ResourceManager

class EnergyGenerator : OutpostModule(name = "Генератор энергии") {
    override fun performAction(manager: ResourceManager) : ModuleResult {
        println("Генератор работает... Производит 20 энергии")
        val energy = manager.get("Energy")

        return if (energy != null) {
            energy.amount += 20
            ModuleResult.ResourseProduced("Energy",20)
        } else {
            manager.add(OutpostResource(id = 99, name = "Energy", amount = 20))
            ModuleResult.Succes("Энергия создана впервые")
        }
    }
}