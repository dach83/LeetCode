package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.ThreeSum
import org.junit.jupiter.api.Test

class ThreeSumTest {

    private fun checkAnswer(expected: List<List<Int>>, nums: IntArray) {
        val sut = ThreeSum()

        val actual = sut.threeSum(nums)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(-1, -1, 2),
            listOf(-1, 0, 1)
        )
        checkAnswer(expected = expected, nums = intArrayOf(-1, 0, 1, 2, -1, -4))
    }

    @Test
    fun example2() {
        checkAnswer(expected = emptyList(), nums = intArrayOf(0, 1, 1))
    }

    @Test
    fun example3() {
        val expected = listOf(
            listOf(0, 0, 0)
        )
        checkAnswer(expected = expected, nums = intArrayOf(0, 0, 0))
    }
}
