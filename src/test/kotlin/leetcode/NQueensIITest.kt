package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.NQueensII
import org.junit.jupiter.api.Test

class NQueensIITest {

    private fun checkAnswer(expected: Int, n: Int) {
        val sut = NQueensII()

        val actual = sut.totalNQueens(n)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, n = 4)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 1, n = 1)
    }
}
