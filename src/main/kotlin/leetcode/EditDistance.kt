package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/edit-distance/)
 */
class EditDistance {

    fun minDistance(word1: String, word2: String): Int {
        val dp = Array(word2.length + 1) {
            IntArray(word1.length + 1)
        }

        for (row in 0..word2.length) dp[row][0] = row
        for (col in 0..word1.length) dp[0][col] = col
        for (row in 1..word2.length) {
            for (col in 1..word1.length) {
                dp[row][col] = if (word1[col - 1] == word2[row - 1]) {
                    dp[row - 1][col - 1]
                } else {
                    minOf(dp[row - 1][col], dp[row][col - 1], dp[row - 1][col - 1]) + 1
                }
            }
        }

        return dp[word2.length][word1.length]
    }
}
