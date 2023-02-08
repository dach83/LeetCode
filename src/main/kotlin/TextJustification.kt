/**
 * Problem description on [LeetCode](https://leetcode.com/problems/text-justification/)
 */
class TextJustification {

    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        val sumWidth = IntArray(words.size + 1) { 0 }
        for (i in 1 until sumWidth.size) {
            sumWidth[i] = sumWidth[i - 1] + words[i - 1].length
        }

        var left = 0
        var wordCount = 1
        val answer = mutableListOf<String>()
        while (left < words.size) {
            val spacedWidth = sumWidth[left + wordCount] - sumWidth[left] + wordCount - 1
            if (spacedWidth > maxWidth) {
                wordCount--
            } else if (left + wordCount < words.size) {
                wordCount++
                continue
            }

            val isLastStr = left + wordCount >= words.size
            val str = if (isLastStr || wordCount == 1) {
                leftJustify(words, maxWidth, left, wordCount)
            } else {
                val textWidth = sumWidth[left + wordCount] - sumWidth[left]
                widthJustify(words, maxWidth, textWidth, left, wordCount)
            }

            answer.add(str)
            left += wordCount
            wordCount = 1
        }

        return answer
    }

    private fun leftJustify(words: Array<String>, maxWidth: Int, left: Int, wordCount: Int): String = buildString {
        append(words[left])
        for (i in left + 1 until left + wordCount) {
            append(" ")
            append(words[i])
        }
        while (length < maxWidth) {
            append(" ")
        }
    }

    private fun widthJustify(words: Array<String>, maxWidth: Int, textWidth: Int, left: Int, wordCount: Int): String =
        buildString {
            var spaceCount = wordCount - 1
            val spaces = IntArray(wordCount - 1) { 1 }
            while (textWidth + spaceCount < maxWidth) {
                spaces[spaceCount % spaces.size]++
                spaceCount++
            }

            append(words[left])
            for (i in 1 until wordCount) {
                append(" ".repeat(spaces[i - 1]))
                append(words[left + i])
            }
        }
}
