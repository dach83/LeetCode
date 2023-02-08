import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TextJustificationTest {

    private fun checkAnswer(expected: List<String>, words: Array<String>, maxWidth: Int) {
        val sut = TextJustification()

        val actual = sut.fullJustify(words, maxWidth)

        assertThat(actual).containsExactlyElementsIn(expected).inOrder()
    }

    @Test
    fun example1() {
        val words = arrayOf(
            "This",
            "is",
            "an",
            "example",
            "of",
            "text",
            "justification."
        )
        val expected = listOf(
            "This    is    an",
            "example  of text",
            "justification.  "
        )
        checkAnswer(expected = expected, words = words, maxWidth = 16)
    }

    @Test
    fun example2() {
        val words = arrayOf(
            "What",
            "must",
            "be",
            "acknowledgment",
            "shall",
            "be"
        )
        val expected = listOf(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        )
        checkAnswer(expected = expected, words = words, maxWidth = 16)
    }

    @Test
    fun example3() {
        val words = arrayOf(
            "Science",
            "is",
            "what",
            "we",
            "understand",
            "well",
            "enough",
            "to",
            "explain",
            "to",
            "a",
            "computer.",
            "Art",
            "is",
            "everything",
            "else",
            "we",
            "do"
        )
        val expected = listOf(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        )
        checkAnswer(expected = expected, words = words, maxWidth = 20)
    }

    @Test
    fun example4() {
        val words = arrayOf(
            "ask",
            "not",
            "what",
            "your",
            "country",
            "can",
            "do",
            "for",
            "you",
            "ask",
            "what",
            "you",
            "can",
            "do",
            "for",
            "your",
            "country"
        )
        val expected = listOf(
            "ask   not   what",
            "your country can",
            "do  for  you ask",
            "what  you can do",
            "for your country"
        )
        checkAnswer(expected = expected, words = words, maxWidth = 16)
    }

    @Test
    fun example5() {
        val words = arrayOf(
            "Don't",
            "go",
            "around",
            "saying",
            "the",
            "world",
            "owes",
            "you",
            "a",
            "living;",
            "the",
            "world",
            "owes",
            "you",
            "nothing;",
            "it",
            "was",
            "here",
            "first."
        )
        val expected = listOf(
            "Don't  go  around  saying  the",
            "world  owes  you a living; the",
            "world owes you nothing; it was",
            "here first.                   "
        )
        checkAnswer(expected = expected, words = words, maxWidth = 30)
    }
}
