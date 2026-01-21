package homework

class GameCharacter(
    val Name: String,
    var status: CharacterState = CharacterState.Afk,
) {
    fun ChangeStatus(stat: CharacterState) {
        status = stat
        println("Character status was change on ${status}")
    }
    fun StatusInfo(status: CharacterState){
        when (status){
            CharacterState.Afk -> println("Character afk")
            CharacterState.Run -> println("Character run")
            is CharacterState.Attack -> println("Character attack ${status.count}")
            is CharacterState.Death -> println("Character dead ${status.reason} :(")
        }
    }
}