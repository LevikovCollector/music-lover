fun main(){
    val musicLoverFlag = true
    val amount = 1000
    val previousPurchaseAmount = 10_001
    var result:Double = amount.toDouble()

    when{
        previousPurchaseAmount >= 1_001 && previousPurchaseAmount <= 10_000 -> result = amount - 100.00
        previousPurchaseAmount >= 10_001 -> result =amount - amount * 0.05
    }
    if(musicLoverFlag && result != 0.00){
        result = amount - result * 0.01
    }
    println("покупка - $amount рублей ")
    println("Итоговая сумма: $result")
}