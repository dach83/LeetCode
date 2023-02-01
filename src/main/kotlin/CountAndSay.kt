/**
 * Problem description on [LeetCode](https://leetcode.com/problems/count-and-say/)
 */
class CountAndSay {

    fun countAndSay(n: Int): String {
        if (n == 1) return "1"
        val s = countAndSay(n - 1)
        return buildString {
            s.splitByDigits().forEach {
                append(it.length)
                append(it[0])
            }
        }
    }

    private fun String.splitByDigits(): List<String> {
        val list = mutableListOf<String>()
        var start = 0
        for (i in 1..length) {
            if (get(start) != getOrNull(i)) {
                list.add(substring(start, i))
                start = i
            }
        }
        return list
    }
}
