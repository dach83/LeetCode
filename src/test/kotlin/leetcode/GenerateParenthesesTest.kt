package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.GenerateParentheses
import org.junit.jupiter.api.Test

class GenerateParenthesesTest {

    private fun checkAnswer(expected: List<String>, n: Int) {
        val sut = GenerateParentheses()

        val actual = sut.generateParenthesis(n)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf("((()))", "(()())", "(())()", "()(())", "()()()")
        checkAnswer(expected = expected, n = 3)
    }

    @Test
    fun example2() {
        val expected = listOf("()")
        checkAnswer(expected = expected, n = 1)
    }
}
