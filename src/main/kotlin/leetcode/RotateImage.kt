package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/rotate-image/)
 */
class RotateImage {

    fun rotate(matrix: Array<IntArray>) {
        swapDiagonal(matrix)
        swapVertical(matrix)
    }

    private fun swapVertical(matrix: Array<IntArray>) {
        for (i in matrix.indices) {
            for (j in 0 until matrix.size / 2) {
                val k = matrix.size - j - 1
                val temp = matrix[i][j]
                matrix[i][j] = matrix[i][k]
                matrix[i][k] = temp
            }
        }
    }

    private fun swapDiagonal(matrix: Array<IntArray>) {
        for (i in matrix.indices) {
            for (j in i + 1 until matrix.size) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
    }
}
