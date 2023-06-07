package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.LongestSubstringWithoutRepeatingCharacters
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharactersTest {

    private fun checkAnswer(expected: Int, s: String) {
        val sut = LongestSubstringWithoutRepeatingCharacters()

        val actual = sut.lengthOfLongestSubstring(s)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 3, s = "abcabcbb")
    }

    @Test
    fun example2() {
        checkAnswer(expected = 1, s = "bbbbb")
    }

    @Test
    fun example3() {
        checkAnswer(expected = 3, s = "pwwkew")
    }
}
