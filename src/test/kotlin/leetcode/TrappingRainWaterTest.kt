package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.TrappingRainWater
import org.junit.jupiter.api.Test

class TrappingRainWaterTest {

    private fun checkAnswer(expected: Int, height: IntArray) {
        val sut = TrappingRainWater()

        val actual = sut.trap(height)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 6, height = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 9, height = intArrayOf(4, 2, 0, 3, 2, 5))
    }
}
