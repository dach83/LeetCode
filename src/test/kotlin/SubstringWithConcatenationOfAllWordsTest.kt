import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SubstringWithConcatenationOfAllWordsTest {

    private fun checkAnswer(expected: List<Int>, s: String, words: Array<String>) {
        val sut = SubstringWithConcatenationOfAllWords()

        val actual = sut.findSubstring(s, words)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = listOf(0, 9), s = "barfoothefoobarman", words = arrayOf("foo", "bar"))
    }

    @Test
    fun example2() {
        checkAnswer(
            expected = listOf(),
            s = "wordgoodgoodgoodbestword",
            words = arrayOf("word", "good", "best", "word")
        )
    }

    @Test
    fun example3() {
        checkAnswer(
            expected = listOf(6, 9, 12),
            s = "barfoofoobarthefoobarman",
            words = arrayOf("bar", "foo", "the")
        )
    }
}
