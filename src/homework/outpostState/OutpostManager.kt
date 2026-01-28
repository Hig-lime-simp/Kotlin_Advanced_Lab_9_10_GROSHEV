package homework.outpostState

import resources.OutpostResource

import kotlin.properties.Delegates

class OutpostManager{
    val Resource: List<ObservableResource> by lazy {
        println("Загружаем список ресурсов")
        listOf(
            ObservableResource("resourse1"),
            ObservableResource("resourse2"),
            ObservableResource("resourse3"),
            ObservableResource("resourse4"),
        )
    }
}