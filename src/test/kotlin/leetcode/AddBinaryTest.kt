package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.AddBinary
import org.junit.jupiter.api.Test

class AddBinaryTest {

    private fun checkAnswer(expected: String, a: String, b: String) {
        val sut = AddBinary()

        val actual = sut.addBinary(a, b)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "100", a = "11", b = "1")
    }

    @Test
    fun example2() {
        checkAnswer(expected = "10101", a = "1010", b = "1011")
    }

    @Test
    fun example3() {
        checkAnswer(expected = "100", a = "11", b = "1")
    }
}
