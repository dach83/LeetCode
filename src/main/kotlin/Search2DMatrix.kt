/**
 * Problem description on [LeetCode](https://leetcode.com/problems/search-a-2d-matrix/)
 */
class Search2DMatrix {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var left = 0
        var right = matrix.size * matrix[0].size - 1

        while (left <= right) {
            val mid = (left + right) / 2
            val elem = valueAtIndex(matrix, mid)
            if (target == elem) return true
            if (target < elem) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return false
    }

    private fun valueAtIndex(matrix: Array<IntArray>, ind: Int): Int {
        val colCount = matrix[0].size
        val row = ind / colCount
        val col = ind - row * colCount
        return matrix[row][col]
    }
}
