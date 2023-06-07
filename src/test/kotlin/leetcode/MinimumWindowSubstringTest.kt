package leetcode

import com.google.common.truth.Truth
import leetcode.MinimumWindowSubstring
import org.junit.jupiter.api.Test

class MinimumWindowSubstringTest {

    private fun checkAnswer(expected: String, s: String, t: String) {
        val sut = MinimumWindowSubstring()

        val actual = sut.minWindow(s, t)

        Truth.assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "BANC", s = "ADOBECODEBANC", t = "ABC")
    }

    @Test
    fun example2() {
        checkAnswer(expected = "a", s = "a", t = "a")
    }

    @Test
    fun example3() {
        checkAnswer(expected = "", s = "a", t = "aa")
    }
}
