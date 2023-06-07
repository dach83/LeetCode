package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.RemoveElement
import org.junit.jupiter.api.Test

class RemoveElementTest {

    private fun checkAnswer(expected: Int, nums: IntArray, `val`: Int) {
        val sut = RemoveElement()

        val actual = sut.removeElement(nums, `val`)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, nums = intArrayOf(3, 2, 2, 3), `val` = 3)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 5, nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), `val` = 2)
    }
}
