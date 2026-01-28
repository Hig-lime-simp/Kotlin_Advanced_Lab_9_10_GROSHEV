package homework.outpostState

import kotlin.properties.Delegates

class ResourceObserver(
    val test: String
) {
    var Test: String by Delegates.observable(test){
        _, old, newValue ->
        println("Изменение $old на $newValue")
    }
}