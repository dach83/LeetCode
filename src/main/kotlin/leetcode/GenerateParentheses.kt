package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/generate-parentheses/)
 */
class GenerateParentheses {

    private val list = mutableListOf<String>()

    fun generateParenthesis(n: Int): List<String> {
        generateRecursion(n, 0, 0, "")
        return list
    }

    private fun generateRecursion(n: Int, opened: Int, closed: Int, s: String) {
        if (opened == n && closed == n) {
            list.add(s)
            return
        }

        if (opened < n) {
            generateRecursion(n, opened + 1, closed, "$s(")
        }

        if (closed < opened) {
            generateRecursion(n, opened, closed + 1, "$s)")
        }
    }
}
