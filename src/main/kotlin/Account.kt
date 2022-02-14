class Account(initialAmount: Amount = Amount()) {

    private val transactions = mutableListOf<Amount>()

    init {
        transactions.add(initialAmount)
    }

    fun deposit(amount: Amount) {
        transactions.add(amount)
    }

    fun withdraw(amount: Amount) {
        transactions.add(amount.negate())
    }

    fun getBalance(): Amount {
        return Amount(transactions.sumOf { it.amount })
    }
}
