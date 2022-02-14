import java.math.BigDecimal
import java.math.RoundingMode

data class Amount(var amount: BigDecimal = BigDecimal.ZERO) {
    init {
        amount = amount.setScale(2, RoundingMode.HALF_UP)
    }

    fun negate(): Amount {
        return Amount(amount.negate())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Amount

        if (amount != other.amount) return false

        return true
    }

    override fun hashCode(): Int {
        return amount.hashCode()
    }
}