import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class InsertIntervalTest {

    private fun checkAnswer(expected: Array<IntArray>, intervals: Array<IntArray>, newInterval: IntArray) {
        val sut = InsertInterval()

        val actual = sut.insert(intervals, newInterval)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val intervals = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(6, 9)
        )
        val expected = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(6, 9)
        )
        checkAnswer(expected = expected, intervals = intervals, newInterval = intArrayOf(2, 5))
    }

    @Test
    fun example2() {
        val intervals = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 5),
            intArrayOf(6, 7),
            intArrayOf(8, 10),
            intArrayOf(12, 16)
        )
        val expected = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 10),
            intArrayOf(12, 16)
        )
        checkAnswer(expected = expected, intervals = intervals, newInterval = intArrayOf(4, 8))
    }
}
