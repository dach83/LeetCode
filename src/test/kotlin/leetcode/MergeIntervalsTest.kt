package leetcode

import com.google.common.truth.Truth
import leetcode.MergeIntervals
import org.junit.jupiter.api.Test

class MergeIntervalsTest {

    private fun checkAnswer(expected: Array<IntArray>, intervals: Array<IntArray>) {
        val sut = MergeIntervals()

        val actual = sut.merge(intervals)

        Truth.assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val intervals = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18)
        )
        val expected = arrayOf(
            intArrayOf(1, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18)
        )
        checkAnswer(expected = expected, intervals = intervals)
    }

    @Test
    fun example2() {
        val intervals = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(4, 5)
        )
        val expected = arrayOf(
            intArrayOf(1, 5)
        )
        checkAnswer(expected = expected, intervals = intervals)
    }
}
