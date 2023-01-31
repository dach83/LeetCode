/**
 * Problem description on [LeetCode](https://leetcode.com/problems/longest-valid-parentheses/)
 */
class LongestValidParentheses {

    fun longestValidParentheses(s: String): Int {
        var answer = 0
        val dp = IntArray(s.length)
        for (i in 1 until s.length) {
            if (s[i] == ')') {
                if (s[i - 1] == '(') {
                    dp[i] = dp.getOrElse(i - 2) { 0 } + 2
                } else if (s.getOrNull(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp.getOrElse(i - 1) { 0 } +
                        dp.getOrElse(i - dp[i - 1] - 2) { 0 } + 2
                }
                answer = maxOf(answer, dp[i])
            }
        }
        return answer
    }
}
