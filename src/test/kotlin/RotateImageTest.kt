import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class RotateImageTest {

    private fun checkAnswer(expected: Array<IntArray>, matrix: Array<IntArray>) {
        val sut = RotateImage()

        sut.rotate(matrix)

        assertThat(matrix).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val expected = arrayOf(
            intArrayOf(7, 4, 1),
            intArrayOf(8, 5, 2),
            intArrayOf(9, 6, 3)
        )
        checkAnswer(expected = expected, matrix = matrix)
    }

    @Test
    fun example2() {
        val matrix = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )
        val expected = arrayOf(
            intArrayOf(15, 13, 2, 5),
            intArrayOf(14, 3, 4, 1),
            intArrayOf(12, 6, 8, 9),
            intArrayOf(16, 7, 10, 11)
        )
        checkAnswer(expected = expected, matrix = matrix)
    }
}
