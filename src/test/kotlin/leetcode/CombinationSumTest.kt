package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.CombinationSum
import org.junit.jupiter.api.Test

class CombinationSumTest {

    private fun checkAnswer(expected: List<List<Int>>, candidates: IntArray, target: Int) {
        val sut = CombinationSum()

        val actual = sut.combinationSum(candidates, target)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(2, 2, 3),
            listOf(7)
        )
        checkAnswer(expected = expected, candidates = intArrayOf(2, 3, 6, 7), target = 7)
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf(2, 2, 2, 2),
            listOf(2, 3, 3),
            listOf(3, 5)
        )
        checkAnswer(expected = expected, candidates = intArrayOf(2, 3, 5), target = 8)
    }

    @Test
    fun example3() {
        checkAnswer(expected = emptyList(), candidates = intArrayOf(2), target = 1)
    }
}
