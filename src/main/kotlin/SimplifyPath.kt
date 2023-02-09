import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/simplify-path/)
 */
class SimplifyPath {

    fun simplifyPath(path: String): String {
        val pathParts = path
            .split("/")
            .filter { it.isNotEmpty() }

        val answer = Stack<String>()
        for (part in pathParts) {
            when (part) {
                "." -> Unit
                ".." -> if (answer.isNotEmpty()) answer.pop()
                else -> answer.push(part)
            }
        }

        return if (answer.isEmpty()) {
            "/"
        } else {
            answer.joinToString(separator = "") { "/$it" }
        }
    }
}
