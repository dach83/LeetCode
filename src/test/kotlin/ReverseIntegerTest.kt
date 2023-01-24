import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class ReverseIntegerTest {

    private fun checkAnswer(expected: Int, x: Int) {
        val sut = ReverseInteger()

        val actual = sut.reverse(x)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 321, x = 123)
    }

    @Test
    fun example2() {
        checkAnswer(expected = -321, x = -123)
    }

    @Test
    fun example3() {
        checkAnswer(expected = 21, x = 120)
    }
}
