import assertk.assertThat
import assertk.assertions.isEqualTo
import java.math.BigDecimal
import org.junit.jupiter.api.Test

class WithdrawMoneyTest {

    @Test
    internal fun `should withdraw money from an existing account`() {
        val expectedBalance = Amount(BigDecimal(14.70))

        val account = Account(INITIAL_AMOUNT)
        account.withdraw(Amount(BigDecimal(5.30)))

        assertThat(account.getBalance()).isEqualTo(expectedBalance)
    }

    @Test
    internal fun `account balance should be 0 when withdraw the same amount previous deposited`() {
        val account = Account()
        account.deposit(Amount(BigDecimal(100.25)))
        account.withdraw(Amount(BigDecimal(100.25)))

        assertThat(account.getBalance()).isEqualTo(Amount())
    }

    private companion object {
        val INITIAL_AMOUNT = Amount(BigDecimal(20.00))
    }
}