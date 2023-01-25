/**
 * Problem description on [LeetCode](https://leetcode.com/problems/regular-expression-matching/)
 */
class RegularExpressionMatching {

    fun isMatch(s: String, p: String): Boolean {
        if (p.isEmpty()) return s.isEmpty()
        val firstMatch = s.isNotEmpty() && (p.firstOrNull() == s.firstOrNull() || p.firstOrNull() == '.')

        return if (p.length >= 2 && p[1] == '*') {
            isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p))
        } else {
            firstMatch && isMatch(s.substring(1), p.substring(1))
        }
    }
}
