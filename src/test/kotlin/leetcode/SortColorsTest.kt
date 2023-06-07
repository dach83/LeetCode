package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.SortColors
import org.junit.jupiter.api.Test

class SortColorsTest {

    private fun checkAnswer(expected: IntArray, nums: IntArray) {
        val sut = SortColors()

        sut.sortColors(nums)

        assertThat(nums).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(0, 0, 1, 1, 2, 2), nums = intArrayOf(2, 0, 2, 1, 1, 0))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(0, 1, 2), nums = intArrayOf(2, 0, 1))
    }
}
