import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class Search2DMatrixTest {

    private fun checkAnswer(expected: Boolean, matrix: Array<IntArray>, target: Int) {
        val sut = Search2DMatrix()

        val actual = sut.searchMatrix(matrix, target)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )
        checkAnswer(expected = true, matrix = matrix, target = 3)
    }

    @Test
    fun example2() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )
        checkAnswer(expected = false, matrix = matrix, target = 13)
    }
}
