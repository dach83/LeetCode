package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/wildcard-matching/)
 */
class WildcardMatching {

    fun isMatch(s: String, p: String): Boolean {
        if (p.isEmpty()) return s.isEmpty()
        if (p == "*") return true

        val dp = Array(s.length + 1) {
            BooleanArray(p.length + 1) { false }
        }

        dp[0][0] = true
        for (j in 1..p.length) {
            dp[0][j] = (p[j - 1] == '*') && dp[0][j - 1]
        }

        for (i in 1..s.length) {
            for (j in 1..p.length) {
                if (p[j - 1] == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1]
                } else {
                    dp[i][j] = (p[j - 1] == s[i - 1] || p[j - 1] == '?') && dp[i - 1][j - 1]
                }
            }
        }

        return dp[s.length][p.length]
    }
}
