package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.LongestValidParentheses
import org.junit.jupiter.api.Test

class LongestValidParenthesesTest {

    private fun checkAnswer(expected: Int, s: String) {
        val sut = LongestValidParentheses()

        val actual = sut.longestValidParentheses(s)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, s = "(()")
    }

    @Test
    fun example2() {
        checkAnswer(expected = 4, s = ")()())")
    }

    @Test
    fun example3() {
        checkAnswer(expected = 0, s = "")
    }
}
