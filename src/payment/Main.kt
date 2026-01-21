package payment

fun main(){
//    val cardType = CardType.VISA
//    println(cardType)
//    println(cardType.ordinal)
//    println(CardType.values().joinToString())
//    val payment1 = Payment("4111111111111111", 1000, CardType.VISA)
//    val payment2 = payment1.copy(type = CardType.MASTERCARD, sum = 2000)
    val processer = PaymentProcesser()
    val  payments = listOf(
        Payment("4_111_111_111_111_111",1000, CardType.VISA),
        Payment("5_111_111_111_111_111",2000, CardType.MASTERCARD),
        Payment("2_222_222_222_222_222",1500, CardType.MIR),
        Payment("1234567812345678",500, CardType.UNKNOWN),
        Payment("123",3000, CardType.VISA)
    )
    println("Обработка платежей")
    payments.forEach { payment -> println("\nПлатеж ${payment.type}: ${payment.card.take(4)}..., ${payment.sum} руб")
        val result = processer.pay(payment)
        processer.show(result)
    }

}