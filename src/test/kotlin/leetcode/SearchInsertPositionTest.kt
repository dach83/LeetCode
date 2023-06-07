package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.SearchInsertPosition
import org.junit.jupiter.api.Test

class SearchInsertPositionTest {

    private fun checkAnswer(expected: Int, nums: IntArray, target: Int) {
        val sut = SearchInsertPosition()

        val actual = sut.searchInsert(nums, target)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, nums = intArrayOf(1, 3, 5, 6), target = 5)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 1, nums = intArrayOf(1, 3, 5, 6), target = 2)
    }

    @Test
    fun example3() {
        checkAnswer(expected = 4, nums = intArrayOf(1, 3, 5, 6), target = 7)
    }
}
