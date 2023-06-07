package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.SqrtX
import org.junit.jupiter.api.Test

class SqrtXTest {

    private fun checkAnswer(expected: Int, x: Int) {
        val sut = SqrtX()

        val actual = sut.mySqrt(x)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, x = 4)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 2, x = 8)
    }

    @Test
    fun example3() {
        checkAnswer(expected = 1, x = 3)
    }
}
