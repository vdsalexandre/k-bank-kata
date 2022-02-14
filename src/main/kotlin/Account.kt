import TransactionType.DEPOSIT
import TransactionType.WITHDRAW
import java.math.BigDecimal

class Account(initialAmount: Amount = Amount()) {
    private val transactions = mutableListOf<Transaction>()

    init {
        if (initialAmount.value > BigDecimal.ZERO)
            transactions.add(Transaction(DEPOSIT, initialAmount))
    }

    fun deposit(amount: Amount) {
        transactions.add(Transaction(DEPOSIT, amount))
    }

    fun withdraw(amount: Amount) {
        transactions.add(Transaction(WITHDRAW, amount.negate()))
    }

    fun getBalance(): Amount {
        return Amount(transactions.map { it.amount }.sumOf { it.value })
    }

    fun getHistory() {
        transactions.mapIndexed { index, transaction ->
            println("#${index + 1}> ${transaction.type} : \t${transaction.amount.value}")
        }
        println("-------------------")
        println("# Balance : ${getBalance().value}")
    }
}
