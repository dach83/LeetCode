package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.LongestCommonPrefix
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    private fun checkAnswer(expected: String, strs: Array<String>) {
        val sut = LongestCommonPrefix()

        val actual = sut.longestCommonPrefix(strs)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "fl", strs = arrayOf("flower", "flow", "flight"))
    }

    @Test
    fun example2() {
        checkAnswer(expected = "", strs = arrayOf("dog", "racecar", "car"))
    }
}
