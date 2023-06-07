package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/set-matrix-zeroes/)
 */
class SetMatrixZeroes {

    fun setZeroes(matrix: Array<IntArray>) {
        val zeroInFirstRow = firstRowContainsZero(matrix)
        val zeroInFirstCol = firstColContainsZero(matrix)

        for (row in 1 until matrix.size) {
            for (col in 1 until matrix[0].size) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0
                    matrix[0][col] = 0
                }
            }
        }

        for (row in 1 until matrix.size) {
            for (col in 1 until matrix[0].size) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0
                }
            }
        }

        if (zeroInFirstRow) {
            for (col in matrix[0].indices) {
                matrix[0][col] = 0
            }
        }

        if (zeroInFirstCol) {
            for (row in matrix.indices) {
                matrix[row][0] = 0
            }
        }
    }

    private fun firstRowContainsZero(matrix: Array<IntArray>): Boolean {
        for (col in matrix[0].indices) {
            if (matrix[0][col] == 0) return true
        }
        return false
    }

    private fun firstColContainsZero(matrix: Array<IntArray>): Boolean {
        for (row in matrix.indices) {
            if (matrix[row][0] == 0) return true
        }
        return false
    }
}
