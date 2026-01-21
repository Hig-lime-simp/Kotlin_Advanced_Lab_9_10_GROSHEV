package modules

import jdk.jfr.DataAmount

sealed class ModuleResult {
    data class Succes(val messege: String) : ModuleResult()
    data class ResourseProduced(
        val resoursename: String, val amount: Int
    ) : ModuleResult()
    data class NotEnoughResourses(
        val  resourseName: String,
        val required: Int,
        val avaible: Int
    ) : ModuleResult()
    data class Error(val reason: String) : ModuleResult()
}
