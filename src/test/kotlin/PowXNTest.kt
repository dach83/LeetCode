import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class PowXNTest {

    private fun checkAnswer(expected: Double, x: Double, n: Int) {
        val sut = PowXN()

        val actual = sut.myPow(x, n)

        assertThat(actual).isWithin(0.0001).of(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 1024.0, x = 2.0, n = 10)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 9.261, x = 2.1, n = 3)
    }

    @Test
    fun example3() {
        checkAnswer(expected = 0.25, x = 2.0, n = -2)
    }

    @Test
    fun example4() {
        checkAnswer(expected = 1.0, x = 1.0, n = -22423122)
    }

    @Test
    fun example5() {
        checkAnswer(expected = 1.0, x = 32412331.123, n = 0)
    }
}
