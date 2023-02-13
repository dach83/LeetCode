import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SetMatrixZeroesTest {

    private fun checkAnswer(expected: Array<IntArray>, matrix: Array<IntArray>) {
        val sut = SetMatrixZeroes()

        sut.setZeroes(matrix)

        assertThat(matrix).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1)
        )
        val expected = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1)
        )
        checkAnswer(expected = expected, matrix = matrix)
    }

    @Test
    fun example2() {
        val matrix = arrayOf(
            intArrayOf(0, 1, 2, 0),
            intArrayOf(3, 4, 5, 2),
            intArrayOf(1, 3, 1, 5)
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 4, 5, 0),
            intArrayOf(0, 3, 1, 0)
        )
        checkAnswer(expected = expected, matrix = matrix)
    }

    @Test
    fun example3() {
        val matrix = arrayOf(
            intArrayOf(1, 0, 3)
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0)
        )
        checkAnswer(expected = expected, matrix = matrix)
    }
}
