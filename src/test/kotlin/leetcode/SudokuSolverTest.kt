package leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SudokuSolverTest {

    private fun checkAnswer(expected: Array<CharArray>, board: Array<CharArray>) {
        val sut = SudokuSolver()

        sut.solveSudoku(board)

        assertThat(board).isEqualTo(expected)
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
        """.trimIndent().toBoard()

        val expected = """
            [["5","3","4","6","7","8","9","1","2"] 
            ,["6","7","2","1","9","5","3","4","8"] 
            ,["1","9","8","3","4","2","5","6","7"] 
            ,["8","5","9","7","6","1","4","2","3"] 
            ,["4","2","6","8","5","3","7","9","1"] 
            ,["7","1","3","9","2","4","8","5","6"] 
            ,["9","6","1","5","3","7","2","8","4"] 
            ,["2","8","7","4","1","9","6","3","5"] 
            ,["3","4","5","2","8","6","1","7","9"]]
        """.trimIndent().toBoard()

        checkAnswer(expected = expected, board = board)
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
