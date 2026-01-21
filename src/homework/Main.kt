package homework

fun main(){
    val test: GameCharacter = GameCharacter("Nikita")
    test.StatusInfo(test.status)
    test.ChangeStatus(CharacterState.Run)
    test.StatusInfo(test.status)
    test.ChangeStatus(CharacterState.Attack(100))
    test.StatusInfo(test.status)
    test.ChangeStatus(CharacterState.Death("Don't pet spiders"))
    test.StatusInfo(test.status)
}