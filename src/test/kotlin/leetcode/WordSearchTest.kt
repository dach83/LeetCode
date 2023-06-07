package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.WordSearch
import org.junit.jupiter.api.Test

class WordSearchTest {

    private fun checkAnswer(expected: Boolean, board: Array<CharArray>, word: String) {
        val sut = WordSearch()

        val actual = sut.exist(board, word)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )
        checkAnswer(expected = true, board = board, word = "ABCCED")
    }

    @Test
    fun example2() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )
        checkAnswer(expected = true, board = board, word = "SEE")
    }

    @Test
    fun example3() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )
        checkAnswer(expected = false, board = board, word = "ABCB")
    }
}
