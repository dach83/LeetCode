import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SpiralMatrixTest {

    private fun checkAnswer(expected: List<Int>, matrix: Array<IntArray>) {
        val sut = SpiralMatrix()

        val actual = sut.spiralOrder(matrix)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        checkAnswer(expected = listOf(1, 2, 3, 6, 9, 8, 7, 4, 5), matrix = matrix)
    }

    @Test
    fun example2() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12)
        )
        checkAnswer(expected = listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), matrix = matrix)
    }

    @Test
    fun example3() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(13, 14, 15, 16)
        )
        checkAnswer(expected = listOf(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10), matrix = matrix)
    }
}
