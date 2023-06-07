package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.DivideTwoIntegers
import org.junit.jupiter.api.Test

class DivideTwoIntegersTest {

    private fun checkAnswer(expected: Int, dividend: Int, divisor: Int) {
        val sut = DivideTwoIntegers()

        val actual = sut.divide(dividend, divisor)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 3, dividend = 10, divisor = 3)
    }

    @Test
    fun example2() {
        checkAnswer(expected = -2, dividend = 7, divisor = -3)
    }
}
