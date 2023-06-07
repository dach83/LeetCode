package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.UniquePathsII
import org.junit.jupiter.api.Test

class UniquePathsIITest {

    private fun checkAnswer(expected: Int, obstacleGrid: Array<IntArray>) {
        val sut = UniquePathsII()

        val actual = sut.uniquePathsWithObstacles(obstacleGrid)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val obstacleGrid = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0)
        )
        checkAnswer(expected = 2, obstacleGrid = obstacleGrid)
    }

    @Test
    fun example2() {
        val obstacleGrid = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 0)
        )
        checkAnswer(expected = 1, obstacleGrid = obstacleGrid)
    }

    @Test
    fun example3() {
        val obstacleGrid = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 1)
        )
        checkAnswer(expected = 0, obstacleGrid = obstacleGrid)
    }

    @Test
    fun example4() {
        val obstacleGrid = arrayOf(
            intArrayOf(1, 0)
        )
        checkAnswer(expected = 0, obstacleGrid = obstacleGrid)
    }

    @Test
    fun example5() {
        val obstacleGrid = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(0, 0)
        )
        checkAnswer(expected = 0, obstacleGrid = obstacleGrid)
    }
}
