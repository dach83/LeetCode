/**
 * Problem description on [LeetCode](https://leetcode.com/problems/unique-paths/)
 */
class UniquePaths {

    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m) {
            IntArray(n) { 1 }
        }

        for (row in 1 until m) {
            for (col in 1 until n) {
                dp[row][col] = dp[row - 1][col] + dp[row][col - 1]
            }
        }

        return dp[m - 1][n - 1]
    }
}
