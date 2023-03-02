import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class LargestRectangleInHistogramTest {

    private fun checkAnswer(expected: Int, heights: IntArray) {
        val sut = LargestRectangleInHistogram()

        val actual = sut.largestRectangleArea(heights)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 10, heights = intArrayOf(2, 1, 5, 6, 2, 3))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 4, heights = intArrayOf(2, 4))
    }

    @Test
    fun example3() {
        checkAnswer(expected = 10, heights = intArrayOf(4, 2, 0, 3, 2, 4, 3, 4))
    }

    @Test
    fun example4() {
        checkAnswer(expected = 12, heights = intArrayOf(5, 5, 1, 7, 1, 1, 5, 2, 7, 6))
    }

    @Test
    fun example5() {
        checkAnswer(
            expected = 14,
            heights = intArrayOf(6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3)
        )
    }

    @Test
    fun example6() {
        checkAnswer(expected = 16, heights = intArrayOf(5, 7, 8, 1, 1, 4, 4, 6, 5, 0, 2))
    }

    @Test
    fun example7() {
        checkAnswer(expected = 24, heights = intArrayOf(3, 5, 5, 2, 5, 5, 6, 6, 4, 4, 1, 1, 2, 5, 5, 6, 6, 4, 1, 3))
    }

    @Test
    fun example8() {
        checkAnswer(expected = 18, heights = intArrayOf(9, 8, 4, 9, 2, 6, 9, 0, 5, 4, 9, 5, 3, 8, 2, 9))
    }
}
