package leetcode

import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/valid-parentheses/)
 */
class ValidParentheses {

    private val parentheses = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        s.forEach { ch ->
            when {
                isOpenParentheses(ch) ->
                    stack.push(ch)

                isCloseParentheses(ch) -> {
                    if (stack.isEmpty()) return false
                    if (parentheses[ch] != stack.pop()) return false
                }
            }
        }

        return stack.isEmpty()
    }

    private fun isOpenParentheses(ch: Char): Boolean {
        return parentheses.values.contains(ch)
    }

    private fun isCloseParentheses(ch: Char): Boolean {
        return parentheses.keys.contains(ch)
    }
}
