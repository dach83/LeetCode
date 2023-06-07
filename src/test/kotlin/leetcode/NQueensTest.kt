package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.NQueens
import org.junit.jupiter.api.Test

class NQueensTest {

    private fun checkAnswer(expected: List<List<String>>, n: Int) {
        val sut = NQueens()

        val actual = sut.solveNQueens(n)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(".Q..", "...Q", "Q...", "..Q."),
            listOf("..Q.", "Q...", "...Q", ".Q..")
        )
        checkAnswer(expected = expected, n = 4)
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf("Q")
        )
        checkAnswer(expected = expected, n = 1)
    }
}
