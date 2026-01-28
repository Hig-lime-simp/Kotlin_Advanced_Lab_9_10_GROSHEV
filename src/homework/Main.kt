package homework

import homework.outpostState.OutpostManager
import homework.outpostState.StateStorage

fun main(){
//    val test: GameCharacter = GameCharacter("Nikita")
//    test.StatusInfo(test.status)
//    test.ChangeStatus(CharacterState.Run)
//    test.StatusInfo(test.status)
//    test.ChangeStatus(CharacterState.Attack(100))
//    test.StatusInfo(test.status)
//    test.ChangeStatus(CharacterState.Death("Don't pet spiders"))
//    test.StatusInfo(test.status)

    val manager = OutpostManager()

    val resources = manager.Resource
    resources.forEach { res ->
        println(" ${res.nameResorse}: ${res.count}")
    }

    resources[0].count = 120
    resources[1].count = 80
    resources[2].count = 200

    val storage = StateStorage()
    storage.save(resources)

    val loadedResources = storage.load()
    if (loadedResources.isNotEmpty()) {
        loadedResources.forEach { res ->
            println("  ${res.nameResorse}: ${res.count}")
        }
    }
}