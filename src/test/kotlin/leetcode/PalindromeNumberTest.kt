package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.PalindromeNumber
import org.junit.jupiter.api.Test

class PalindromeNumberTest {

    private fun checkAnswer(expected: Boolean, x: Int) {
        val sut = PalindromeNumber()

        val actual = sut.isPalindrome(x)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = true, x = 121)
    }

    @Test
    fun example2() {
        checkAnswer(expected = false, x = -121)
    }

    @Test
    fun example3() {
        checkAnswer(expected = false, x = 10)
    }
}
