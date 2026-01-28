package homework.outpostState

import java.io.File
import kotlin.properties.Delegates

class StateStorage {
    private val FILE_NAME = "State_Storage.txt"

    fun save(resources: List<ObservableResource>) {
        val file = File(FILE_NAME)
        val txt = resources.joinToString(" ") { resource ->
            "${resource.nameResorse}, ${resource.count}"
        }
        file.writeText(txt)
    }

    fun load(): List<ObservableResource> {
        val file = File(FILE_NAME)
        if (!file.exists()) {
            println("Файл сохранения не найден.")
            return emptyList()
        }

        return file.readLines().map { line ->
            val res = line.split(";")
            val name = res[0]
            val count = res[1].toIntOrNull()
            ObservableResource(name).apply {}
        }
    }
}
