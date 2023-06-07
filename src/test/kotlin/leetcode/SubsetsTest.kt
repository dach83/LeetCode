package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.Subsets
import org.junit.jupiter.api.Test

class SubsetsTest {

    private fun checkAnswer(expected: List<List<Int>>, nums: IntArray) {
        val sut = Subsets()

        val actual = sut.subsets(nums)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(),
            listOf(1),
            listOf(2),
            listOf(1, 2),
            listOf(3),
            listOf(1, 3),
            listOf(2, 3),
            listOf(1, 2, 3)
        )
        checkAnswer(expected = expected, nums = intArrayOf(1, 2, 3))
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf(),
            listOf(0)
        )
        checkAnswer(expected = expected, nums = intArrayOf(0))
    }
}
