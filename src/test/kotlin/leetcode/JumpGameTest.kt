package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.JumpGame
import org.junit.jupiter.api.Test

class JumpGameTest {

    private fun checkAnswer(expected: Boolean, nums: IntArray) {
        val sut = JumpGame()

        val actual = sut.canJump(nums)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = true, nums = intArrayOf(2, 3, 1, 1, 4))
    }

    @Test
    fun example2() {
        checkAnswer(expected = false, nums = intArrayOf(3, 2, 1, 0, 4))
    }
}
