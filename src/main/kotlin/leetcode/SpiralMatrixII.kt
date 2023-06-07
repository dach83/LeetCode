package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/spiral-matrix-ii/)
 */
class SpiralMatrixII {

    fun generateMatrix(n: Int): Array<IntArray> {
        val matrix = Array(n) {
            IntArray(n) { 0 }
        }

        var left = 0
        var right = n - 1
        var top = 0
        var bottom = n - 1
        var value = 1

        while (left <= right && top <= bottom) {
            for (col in left..right) {
                matrix[top][col] = value++
            }
            top++

            for (row in top..bottom) {
                matrix[row][right] = value++
            }
            right--

            for (col in right downTo left) {
                matrix[bottom][col] = value++
            }
            bottom--

            for (row in bottom downTo top) {
                matrix[row][left] = value++
            }
            left++
        }
        return matrix
    }
}
