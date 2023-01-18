/**
 * Problem description on [LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 */
class LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        var start = 0
        val occ = mutableMapOf<Char, Int>()

        for ((i, c) in s.withIndex()) {
            if (occ.containsKey(c)) {
                val seekPoint = occ[c]!! + 1
                start = maxOf(seekPoint, start)
            }

            val length = i - start + 1
            max = maxOf(length, max)

            occ[c] = i
        }

        return max
    }
}
