package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.PlusOne
import org.junit.jupiter.api.Test

class PlusOneTest {

    private fun checkAnswer(expected: IntArray, digits: IntArray) {
        val sut = PlusOne()

        val actual = sut.plusOne(digits)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 2, 4), digits = intArrayOf(1, 2, 3))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(4, 3, 2, 2), digits = intArrayOf(4, 3, 2, 1))
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(1, 0), digits = intArrayOf(9))
    }
}
