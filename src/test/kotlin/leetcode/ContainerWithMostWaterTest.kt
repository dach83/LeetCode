package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.ContainerWithMostWater
import org.junit.jupiter.api.Test

class ContainerWithMostWaterTest {

    private fun checkAnswer(expected: Int, height: IntArray) {
        val sut = ContainerWithMostWater()

        val actual = sut.maxArea(height)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 49, height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 1, height = intArrayOf(1, 1))
    }
}
