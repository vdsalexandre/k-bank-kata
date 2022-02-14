import java.math.BigDecimal
import java.math.RoundingMode

data class Amount(var value: BigDecimal = BigDecimal.ZERO) {
    init {
        value = value.setScale(2, RoundingMode.HALF_UP)
    }

    fun negate(): Amount {
        return Amount(value.negate())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Amount

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}