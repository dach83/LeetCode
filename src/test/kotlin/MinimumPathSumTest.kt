import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class MinimumPathSumTest {

    private fun checkAnswer(expected: Int, grid: Array<IntArray>) {
        val sut = MinimumPathSum()

        val actual = sut.minPathSum(grid)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val grid = arrayOf(
            intArrayOf(1, 3, 1),
            intArrayOf(1, 5, 1),
            intArrayOf(4, 2, 1)
        )
        checkAnswer(expected = 7, grid = grid)
    }

    @Test
    fun example2() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6)
        )
        checkAnswer(expected = 12, grid = grid)
    }
}
