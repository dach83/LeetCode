package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.IntegerToRoman
import org.junit.jupiter.api.Test

class IntegerToRomanTest {

    private fun checkAnswer(expected: String, num: Int) {
        val sut = IntegerToRoman()

        val actual = sut.intToRoman(num)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "III", num = 3)
    }

    @Test
    fun example2() {
        checkAnswer(expected = "LVIII", num = 58)
    }

    @Test
    fun example3() {
        checkAnswer(expected = "MCMXCIV", num = 1994)
    }
}
