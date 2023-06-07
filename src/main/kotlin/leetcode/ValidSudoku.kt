package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/valid-sudoku/)
 */
class ValidSudoku {

    private val row = mutableSetOf<Pair<Int, Char>>()
    private val col = mutableSetOf<Pair<Int, Char>>()
    private val box = mutableSetOf<Pair<Int, Char>>()

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (!checkCell(board, i, j)) {
                    return false
                }
            }
        }
        return true
    }

    private fun checkCell(board: Array<CharArray>, i: Int, j: Int): Boolean {
        val ch = board[i][j]
        val k = i / 3 * 10 + j / 3

        if (ch == '.') return true
        if (!row.add(i to ch)) return false
        if (!col.add(j to ch)) return false
        if (!box.add(k to ch)) return false
        return true
    }
}
