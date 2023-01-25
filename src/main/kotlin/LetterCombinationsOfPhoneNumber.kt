/**
 * Problem description on [LeetCode](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 */
class LetterCombinationsOfPhoneNumber {

    private val letters = mapOf<Char, List<Char>>(
        '2' to listOf('a', 'b', 'c'),
        '3' to listOf('d', 'e', 'f'),
        '4' to listOf('g', 'h', 'i'),
        '5' to listOf('j', 'k', 'l'),
        '6' to listOf('m', 'n', 'o'),
        '7' to listOf('p', 'q', 'r', 's'),
        '8' to listOf('t', 'u', 'v'),
        '9' to listOf('w', 'x', 'y', 'z')
    )

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()

        var res = mutableListOf("")

        for (d in digits) {
            val temp = mutableListOf<String>()
            letters[d]?.forEach { l ->
                for (r in res) {
                    temp.add(r + l)
                }
            }
            res = temp
        }

        return res
    }
}
