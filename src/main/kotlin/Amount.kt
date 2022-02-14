import java.math.BigDecimal
import java.math.RoundingMode

data class Amount(var value: BigDecimal = BigDecimal.ZERO) {
    init {
        value = value.setScale(2, RoundingMode.HALF_UP)
    }

    fun negate(): Amount {
        return Amount(value.negate())
    }
}