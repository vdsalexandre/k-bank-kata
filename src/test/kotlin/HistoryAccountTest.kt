import java.math.BigDecimal
import org.junit.jupiter.api.Test

class HistoryAccountTest {

    @Test
    internal fun `should print account transactions history`() {
        val account = Account()
        account.deposit(Amount(BigDecimal(10.50)))
        account.deposit(Amount(BigDecimal(22.00)))
        account.withdraw(Amount(BigDecimal(7.50)))
        account.deposit(Amount(BigDecimal(25.10)))
        account.deposit(Amount(BigDecimal(35.35)))
        account.withdraw(Amount(BigDecimal(17.90)))

        account.getHistory()
    }
}