package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/longest-common-prefix/)
 */
class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        val firstWord = strs.first()
        if (firstWord.isEmpty() || !checkCharAtIndex(strs, 0)) {
            return ""
        }

        for (i in firstWord.indices) {
            if (!checkCharAtIndex(strs, i)) {
                return firstWord.substring(0, i)
            }
        }

        return firstWord
    }

    private fun checkCharAtIndex(strs: Array<String>, index: Int): Boolean {
        val ch = strs.first()[index]
        strs.forEach {
            if (index >= it.length || it[index] != ch) {
                return false
            }
        }
        return true
    }
}
