import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class StringToIntegerTest {

    private fun checkAnswer(expected: Int, s: String) {
        val sut = StringToInteger()

        val actual = sut.myAtoi(s)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 42, s = "42")
    }

    @Test
    fun example2() {
        checkAnswer(expected = -42, s = "   -42")
    }

    @Test
    fun example3() {
        checkAnswer(expected = 4193, s = "4193 with words")
    }
}
