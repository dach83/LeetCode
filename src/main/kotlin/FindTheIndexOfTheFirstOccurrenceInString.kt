/**
 * Problem description on [LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)
 */
class FindTheIndexOfTheFirstOccurrenceInString {

    fun strStr(haystack: String, needle: String): Int {
        for (pos in 0..haystack.length - needle.length) {
            for (shift in needle.indices) {
                if (haystack[pos + shift] != needle[shift]) {
                    break
                }
                if (shift == needle.length - 1) {
                    return pos
                }
            }
        }
        return -1
    }
}
