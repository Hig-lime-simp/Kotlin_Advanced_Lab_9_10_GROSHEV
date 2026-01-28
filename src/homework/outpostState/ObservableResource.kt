package homework.outpostState

import kotlin.properties.Delegates

class ObservableResource(name: String) {
    val nameResorse: String = name
    var count: Int by Delegates.observable(100) { _, old, new ->
        println("Ресурс Minerals изменен: '$old' -> '$new'")
    }
}