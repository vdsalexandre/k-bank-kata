import assertk.assertThat
import assertk.assertions.isEqualTo
import java.math.BigDecimal
import org.junit.jupiter.api.Test

class SaveMoneyTest {

    @Test
    internal fun `should create a bank account and add some money`() {
        val expectedBalance = Amount(BigDecimal(50.00))

        val account = Account()
        account.deposit(INITIAL_AMOUNT)

        assertThat(account.getBalance()).isEqualTo(expectedBalance)
    }

    @Test
    internal fun `should create a bank account with an initial amount and add some money`() {
        val expectedBalance = Amount(BigDecimal(185.50))

        val account = Account(INITIAL_AMOUNT)
        account.deposit(Amount(BigDecimal(135.50)))

        assertThat(account.getBalance()).isEqualTo(expectedBalance)
    }

    private companion object {
        val INITIAL_AMOUNT = Amount(BigDecimal(50.00))
    }
}