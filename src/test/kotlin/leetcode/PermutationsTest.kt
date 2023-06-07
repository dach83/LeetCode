package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.Permutations
import org.junit.jupiter.api.Test

class PermutationsTest {

    private fun checkAnswer(expected: List<List<Int>>, nums: IntArray) {
        val sut = Permutations()

        val actual = sut.permute(nums)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1)
        )
        checkAnswer(expected = expected, nums = intArrayOf(1, 2, 3))
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf(0, 1),
            listOf(1, 0)
        )
        checkAnswer(expected = expected, nums = intArrayOf(0, 1))
    }

    @Test
    fun example3() {
        val expected = listOf(
            listOf(1)
        )
        checkAnswer(expected = expected, nums = intArrayOf(1))
    }
}
