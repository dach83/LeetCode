import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class RomanToIntegerTest {

    private fun checkAnswer(expected: Int, s: String) {
        val sut = RomanToInteger()

        val actual = sut.romanToInt(s)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 3, s = "III")
    }

    @Test
    fun example2() {
        checkAnswer(expected = 58, s = "LVIII")
    }

    @Test
    fun example3() {
        checkAnswer(expected = 1994, s = "MCMXCIV")
    }
}
