/**
 * Problem description on [LeetCode](https://leetcode.com/problems/unique-paths-ii/)
 */
class UniquePathsII {

    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val height = obstacleGrid.size
        val width = obstacleGrid.first().size

        if (obstacleGrid[0][0] == 1 || obstacleGrid[height - 1][width - 1] == 1) {
            return 0
        }

        val dp = Array(height) {
            IntArray(width) { 0 }
        }

        dp[0][0] = 1
        for (row in 1 until height) {
            if (obstacleGrid[row][0] == 0) {
                dp[row][0] = dp[row - 1][0]
            }
        }

        for (col in 1 until width) {
            if (obstacleGrid[0][col] == 0) {
                dp[0][col] = dp[0][col - 1]
            }
        }

        for (row in 1 until height) {
            for (col in 1 until width) {
                if (obstacleGrid[row][col] == 0) {
                    dp[row][col] = dp[row - 1][col] + dp[row][col - 1]
                }
            }
        }

        return dp[height - 1][width - 1]
    }
}
