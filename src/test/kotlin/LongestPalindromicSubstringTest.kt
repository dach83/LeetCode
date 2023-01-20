import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class LongestPalindromicSubstringTest {

    private fun checkAnswer(expected: List<String>, s: String) {
        val sut = LongestPalindromicSubstring()

        val actual = sut.longestPalindrome(s)

        assertThat(actual).isIn(expected)
    }

    @Test
    fun example1() {
        checkAnswer(listOf("aba", "bab"), "babad")
    }

    @Test
    fun example2() {
        checkAnswer(listOf("bb"), "cbbd")
    }
}
