/**
 * Problem description on [LeetCode](https://leetcode.com/problems/word-search/)
 */
class WordSearch {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        val used = Array(board.size) {
            BooleanArray(board[0].size)
        }

        for (row in board.indices) {
            for (col in board[row].indices) {
                val found = search(board, word, used, 0, row, col)
                if (found) return true
            }
        }
        return false
    }

    private fun search(
        board: Array<CharArray>,
        word: String,
        used: Array<BooleanArray>,
        from: Int,
        row: Int,
        col: Int
    ): Boolean {
        if (from > word.lastIndex) return true
        if (row < 0 || row > board.lastIndex || col < 0 || col > board[0].lastIndex) return false
        if (used[row][col]) return false

        var found = false
        if (word[from] == board[row][col]) {
            used[row][col] = true
            found =
                search(board, word, used, from + 1, row - 1, col) ||
                search(board, word, used, from + 1, row + 1, col) ||
                search(board, word, used, from + 1, row, col - 1) ||
                search(board, word, used, from + 1, row, col + 1)
            used[row][col] = false
        }
        return found
    }
}
