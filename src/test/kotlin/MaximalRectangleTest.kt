import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class MaximalRectangleTest {

    private fun checkAnswer(expected: Int, matrix: Array<CharArray>) {
        val sut = MaximalRectangle()

        val actual = sut.maximalRectangle(matrix)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val matrix = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0')
        )
        checkAnswer(expected = 6, matrix = matrix)
    }

    @Test
    fun example2() {
        val matrix = arrayOf(
            charArrayOf('0')
        )
        checkAnswer(expected = 0, matrix = matrix)
    }

    @Test
    fun example3() {
        val matrix = arrayOf(
            charArrayOf('1')
        )
        checkAnswer(expected = 1, matrix = matrix)
    }
}
