/**
 * Problem description on [LeetCode](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)
 */
class SubstringWithConcatenationOfAllWords {

    private var wordsCount = 0
    private var wordLength = 0
    private var permutationLength = 0
    private val wordsMap = mutableMapOf<String, Int>()

    fun findSubstring(s: String, words: Array<String>): List<Int> {
        wordsCount = words.size
        wordLength = words[0].length
        permutationLength = wordLength * wordsCount

        words.forEach { word ->
            wordsMap.compute(word) { _, count ->
                if (count == null) 1 else count + 1
            }
        }

        val answer = mutableListOf<Int>()
        for (i in 0..s.length - permutationLength) {
            if (checkPermutation(i, s)) {
                answer.add(i)
            }
        }

        return answer
    }

    private fun checkPermutation(i: Int, s: String): Boolean {
        val remaining = HashMap<String, Int>(wordsMap)
        var usedWords = 0

        for (j in i until i + permutationLength step wordLength) {
            val word = s.substring(j until j + wordLength)
            if (remaining.getOrDefault(word, 0) > 0) {
                remaining.compute(word) { _, count ->
                    count?.minus(1)
                }
                usedWords++
            } else {
                break
            }
        }

        return usedWords == wordsCount
    }
}
