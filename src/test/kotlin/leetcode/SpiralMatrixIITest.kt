package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.SpiralMatrixII
import org.junit.jupiter.api.Test

class SpiralMatrixIITest {

    private fun checkAnswer(expected: Array<IntArray>, n: Int) {
        val sut = SpiralMatrixII()

        val actual = sut.generateMatrix(n)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val expected = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(8, 9, 4),
            intArrayOf(7, 6, 5)
        )
        checkAnswer(expected = expected, n = 3)
    }

    @Test
    fun example2() {
        val expected = arrayOf(
            intArrayOf(1)
        )
        checkAnswer(expected = expected, n = 1)
    }

    @Test
    fun example3() {
        val expected = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(12, 13, 14, 5),
            intArrayOf(11, 16, 15, 6),
            intArrayOf(10, 9, 8, 7)
        )
        checkAnswer(expected = expected, n = 4)
    }
}
