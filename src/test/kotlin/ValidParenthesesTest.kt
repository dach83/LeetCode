import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    private fun checkAnswer(expected: Boolean, s: String) {
        val sut = ValidParentheses()

        val actual = sut.isValid(s)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = true, s = "()")
    }

    @Test
    fun example2() {
        checkAnswer(expected = true, s = "()[]{}")
    }

    @Test
    fun example3() {
        checkAnswer(expected = false, s = "(]")
    }
}
