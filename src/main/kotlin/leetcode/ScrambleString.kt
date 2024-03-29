/**
 * Problem description on [LeetCode](https://leetcode.com/problems/scramble-string/)
 */
class ScrambleString {

    fun isScramble(s1: String, s2: String): Boolean {
        if (s1 == s2) return true

        val letters = IntArray(26) { 0 }
        for (i in s1.indices) {
            letters[s1[i].minus('a')]++
            letters[s2[i].minus('a')]--
        }

        val lettersNotEqual = letters.any { it != 0 }
        if (lettersNotEqual) return false

        for (i in 1 until s1.length) {
            if (isScramble(s1.substring(i), s2.substring(i)) &&
                isScramble(s1.substring(0, i), s2.substring(0, i))
            ) {
                return true
            }
            if (isScramble(s1.substring(0, i), s2.substring(s2.length - i)) &&
                isScramble(s1.substring(i), s2.substring(0, s2.length - i))
            ) {
                return true
            }
        }

        return false
    }
}
