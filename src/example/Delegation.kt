package example
import kotlin.properties.Delegates

//interface Base{
//    fun someFun()
//}
//class  BaseImpl() : Base{
//    override fun someFun() {
//    }
//}
//class  Derived(someBase: Base) : Base by someBase
var counter: Int by Delegates.observable(0) {_,old,new ->
    println("Счетчик изменился: $old -> $new")
}

class User{
    var name: String by Delegates.observable("<no name>") {_,old,new ->
        println("Имя изменилось: $old -> $new")
    }
}
interface Messneger{
    fun sendTextMessage()
    fun sendVideoMessage()
}
interface PhotoDevice{
    fun takePhoto()
}
class PhotoCamera : PhotoDevice{
    override fun takePhoto() {
        println("Take a photo")
    }
}
class  InstantMessenger(val programName: String) : Messneger{
    override fun sendTextMessage() {
        println("Send txt message")
    }

    override fun sendVideoMessage() {
        println("Send video message")
    }
}
class  SmartPhone(val name: String, m: Messneger) : Messneger by m{
    override fun sendTextMessage() {
        println("Send sms")
    }
}

