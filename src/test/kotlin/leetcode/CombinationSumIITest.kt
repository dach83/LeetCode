package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.CombinationSumII
import org.junit.jupiter.api.Test

class CombinationSumIITest {

    private fun checkAnswer(expected: List<List<Int>>, candidates: IntArray, target: Int) {
        val sut = CombinationSumII()

        val actual = sut.combinationSum2(candidates, target)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(1, 1, 6),
            listOf(1, 2, 5),
            listOf(1, 7),
            listOf(2, 6)
        )
        checkAnswer(expected = expected, candidates = intArrayOf(10, 1, 2, 7, 6, 1, 5), target = 8)
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf(1, 2, 2),
            listOf(5)
        )
        checkAnswer(expected = expected, candidates = intArrayOf(2, 5, 2, 1, 2), target = 5)
    }
}
