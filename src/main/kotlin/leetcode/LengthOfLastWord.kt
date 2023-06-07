package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/length-of-last-word/)
 */
class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {
        var count = 0
        for (i in s.length - 1 downTo 0) {
            if (s[i] == ' ' && count == 0) continue
            if (s[i] == ' ' && count > 0) break
            count++
        }
        return count
    }
}
