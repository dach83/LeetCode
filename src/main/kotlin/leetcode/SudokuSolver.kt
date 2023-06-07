package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/sudoku-solver/)
 */
class SudokuSolver {

    private val boardLength = 9
    private val boardSize = boardLength * boardLength

    private val row = mutableSetOf<Pair<Int, Char>>()
    private val col = mutableSetOf<Pair<Int, Char>>()
    private val box = mutableSetOf<Pair<Int, Char>>()

    fun solveSudoku(board: Array<CharArray>) {
        init(board)
        solve(board, 0)
    }

    private fun solve(board: Array<CharArray>, start: Int): Boolean {
        val next = board.nextDot(start)
        if (next >= boardSize) return true

        for (ch in '1'..'9') {
            if (check(next, ch)) {
                put(board, next, ch)
                val isSolved = solve(board, next + 1)
                if (isSolved) return true
                put(board, next, '.')
            }
        }
        return false
    }

    private fun init(board: Array<CharArray>) {
        for (k in 0 until boardSize) {
            val ch = board.cell(k)
            if (ch != '.') {
                row.add(rowIndex(k) to ch)
                col.add(colIndex(k) to ch)
                box.add(boxIndex(k) to ch)
            }
        }
    }

    private fun put(board: Array<CharArray>, k: Int, newCh: Char) {
        val oldCh = board.cell(k)
        if (oldCh == newCh) return

        if (oldCh != '.') {
            row.remove(rowIndex(k) to oldCh)
            col.remove(colIndex(k) to oldCh)
            box.remove(boxIndex(k) to oldCh)
        }

        if (newCh != '.') {
            row.add(rowIndex(k) to newCh)
            col.add(colIndex(k) to newCh)
            box.add(boxIndex(k) to newCh)
        }

        board.putToCell(k, newCh)
    }

    private fun check(k: Int, ch: Char): Boolean {
        if (ch == '.') return true
        if (row.contains(rowIndex(k) to ch)) return false
        if (col.contains(colIndex(k) to ch)) return false
        if (box.contains(boxIndex(k) to ch)) return false
        return true
    }

    private fun rowIndex(k: Int) = k / boardLength

    private fun colIndex(k: Int) = k % boardLength

    private fun boxIndex(k: Int) = rowIndex(k) / 3 * 10 + colIndex(k) / 3

    private fun Array<CharArray>.cell(k: Int): Char {
        try {
            return this[rowIndex(k)][colIndex(k)]
        } catch (e: Exception) {
            println("exception at $k")
        }
        return ' '
    }

    private fun Array<CharArray>.putToCell(k: Int, ch: Char) {
        this[rowIndex(k)][colIndex(k)] = ch
    }

    private fun Array<CharArray>.nextDot(start: Int): Int {
        for (k in start until boardSize) {
            if (this.cell(k) == '.') return k
        }
        return boardSize
    }
}
