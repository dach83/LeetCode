package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.MultiplyStrings
import org.junit.jupiter.api.Test

class MultiplyStringsTest {

    private fun checkAnswer(expected: String, num1: String, num2: String) {
        val sut = MultiplyStrings()

        val actual = sut.multiply(num1, num2)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "6", num1 = "2", num2 = "3")
    }

    @Test
    fun example2() {
        checkAnswer(expected = "56088", num1 = "123", num2 = "456")
    }

    @Test
    fun example3() {
        checkAnswer(expected = "0", num1 = "0", num2 = "0")
    }

    @Test
    fun example4() {
        checkAnswer(expected = "121932631112635269", num1 = "123456789", num2 = "987654321")
    }
}
