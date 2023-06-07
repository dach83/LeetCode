package leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class ValidSudokuTest {

    private fun checkAnswer(expected: Boolean, board: Array<CharArray>) {
        val sut = ValidSudoku()

        val actual = sut.isValidSudoku(board)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val board = """
            [["5","3",".",".","7",".",".",".","."]
            ,["6",".",".","1","9","5",".",".","."]
            ,[".","9","8",".",".",".",".","6","."]
            ,["8",".",".",".","6",".",".",".","3"]
            ,["4",".",".","8",".","3",".",".","1"]
            ,["7",".",".",".","2",".",".",".","6"]
            ,[".","6",".",".",".",".","2","8","."]
            ,[".",".",".","4","1","9",".",".","5"]
            ,[".",".",".",".","8",".",".","7","9"]]
        """
            .trimIndent()
            .toBoard()
        checkAnswer(expected = true, board = board)
    }

    @Test
    fun example2() {
        val board = """
            [["8","3",".",".","7",".",".",".","."]
            ,["6",".",".","1","9","5",".",".","."]
            ,[".","9","8",".",".",".",".","6","."]
            ,["8",".",".",".","6",".",".",".","3"]
            ,["4",".",".","8",".","3",".",".","1"]
            ,["7",".",".",".","2",".",".",".","6"]
            ,[".","6",".",".",".",".","2","8","."]
            ,[".",".",".","4","1","9",".",".","5"]
            ,[".",".",".",".","8",".",".","7","9"]]
        """
            .trimIndent()
            .toBoard()
        checkAnswer(expected = false, board = board)
    }

    private fun String.toBoard() = this.split("\n,[")
        .map { row ->
            row
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .split(",")
                .map { it[0] }
                .toCharArray()
        }.toTypedArray()
}
