/**
 * Problem description on [LeetCode](https://leetcode.com/problems/minimum-path-sum/)
 */
class MinimumPathSum {

    fun minPathSum(grid: Array<IntArray>): Int {
        val height = grid.size
        val width = grid.first().size

        val dp = Array(height) {
            IntArray(width) { Int.MAX_VALUE }
        }

        dp[0][0] = grid[0][0]
        for (row in 1 until height) dp[row][0] = dp[row - 1][0] + grid[row][0]
        for (col in 1 until width) dp[0][col] = dp[0][col - 1] + grid[0][col]
        for (row in 1 until height) {
            for (col in 1 until width) {
                dp[row][col] = grid[row][col] + minOf(dp[row - 1][col], dp[row][col - 1])
            }
        }

        return dp[height - 1][width - 1]
    }
}
