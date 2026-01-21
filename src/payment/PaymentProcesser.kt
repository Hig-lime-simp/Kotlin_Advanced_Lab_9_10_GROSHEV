package payment

class PaymentProcesser  {
    private  val  validator = PaymentValidator()

    fun pay(payment: Payment) : PaymentResult{
        if (!validator.check(payment)){
            return PaymentResult.Error("ошибка валидации")

        }
        return when (payment.type){
            CardType.VISA -> PaymentResult.Succes("VISA-${System.currentTimeMillis()}")
            CardType.MASTERCARD -> PaymentResult.Processing
            CardType.MIR -> PaymentResult.Succes("VISA-${System.currentTimeMillis()}")
            CardType.UNKNOWN -> PaymentResult.Error("Неизвестный тип карты")
        }
    }
    fun show(result: PaymentResult){
        when (result) {
            is PaymentResult.Succes -> println("Succes: ${result.id}")
            is PaymentResult.Error -> println("Error: ${result.reason}")
            PaymentResult.Processing -> println("loading...")
        }
    }
}