package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/n-queens/)
 */
class NQueens {

    private val answers = mutableListOf<List<String>>()

    private lateinit var isEmptyVertical: BooleanArray
    private lateinit var isEmptyDiagonal1: BooleanArray
    private lateinit var isEmptyDiagonal2: BooleanArray

    fun solveNQueens(n: Int): List<List<String>> {
        val current = IntArray(n) { EMPTY_CELL }
        isEmptyVertical = BooleanArray(n) { true }
        isEmptyDiagonal1 = BooleanArray(2 * n) { true }
        isEmptyDiagonal2 = BooleanArray(2 * n) { true }
        backtrack(n, 0, current)
        return answers
    }

    private fun backtrack(n: Int, row: Int, current: IntArray) {
        if (row >= n) {
            answers.add(current.toAnswer())
            return
        }

        for (col in 0 until n) {
            val diagonal1Index = n + col - row - 1
            val diagonal2Index = 2 * n - col - row - 2
            if (isEmptyVertical[col] &&
                isEmptyDiagonal1[diagonal1Index] &&
                isEmptyDiagonal2[diagonal2Index]
            ) {
                isEmptyVertical[col] = false
                isEmptyDiagonal1[diagonal1Index] = false
                isEmptyDiagonal2[diagonal2Index] = false
                current[row] = col

                backtrack(n, row + 1, current)

                current[row] = EMPTY_CELL
                isEmptyVertical[col] = true
                isEmptyDiagonal1[diagonal1Index] = true
                isEmptyDiagonal2[diagonal2Index] = true
            }
        }
    }

    private fun IntArray.toAnswer(): List<String> = map {
        ".".repeat(size).replaceRange(it, it + 1, "Q")
    }

    companion object {
        private const val EMPTY_CELL = -1
    }
}
