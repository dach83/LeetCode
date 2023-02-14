/**
 * Problem description on [LeetCode](https://leetcode.com/problems/minimum-window-substring/)
 */
class MinimumWindowSubstring {

    fun minWindow(s: String, t: String): String {
        val charsCount = initCharsCount(t)
        var answer = ""
        var left = 0
        var right = -1
        var remainsToFind = t.length
        while (left <= s.length - t.length) {
            if (remainsToFind > 0 && right < s.length - 1) {
                right++
                charsCount.computeIfPresent(s[right]) { _, old ->
                    if (old > 0) remainsToFind--
                    old - 1
                }
            } else {
                left++
                charsCount.computeIfPresent(s[left - 1]) { _, old ->
                    if (old >= 0) remainsToFind++
                    old + 1
                }
            }

            if (remainsToFind == 0 && (right - left < answer.length || answer.isEmpty())) {
                answer = s.substring(left, right + 1)
            }
        }

        return answer
    }

    private fun initCharsCount(str: String): MutableMap<Char, Int> {
        val charsCount = HashMap<Char, Int>()
        for (ch in str) {
            charsCount[ch] = charsCount.getOrDefault(ch, 0) + 1
        }
        return charsCount
    }
}
