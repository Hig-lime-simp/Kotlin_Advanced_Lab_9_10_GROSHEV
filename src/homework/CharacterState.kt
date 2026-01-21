package homework

sealed class CharacterState {
    object Afk : CharacterState()
    object Run : CharacterState()
    data class Attack(val count: Int) : CharacterState()
    data class Death(val reason: String) : CharacterState()
}