package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.ValidNumber
import org.junit.jupiter.api.Test

class ValidNumberTest {

    private fun checkAnswer(expected: Boolean, s: String) {
        val sut = ValidNumber()

        val actual = sut.isNumber(s)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = true, s = "0")
    }

    @Test
    fun example2() {
        checkAnswer(expected = true, s = "2")
    }

    @Test
    fun example3() {
        checkAnswer(expected = true, s = "0089")
    }

    @Test
    fun example4() {
        checkAnswer(expected = true, s = "-0.1")
    }

    @Test
    fun example5() {
        checkAnswer(expected = true, s = "+3.14")
    }

    @Test
    fun example6() {
        checkAnswer(expected = true, s = "4.")
    }

    @Test
    fun example7() {
        checkAnswer(expected = true, s = "-.9")
    }

    @Test
    fun example8() {
        checkAnswer(expected = true, s = "2e10")
    }

    @Test
    fun example9() {
        checkAnswer(expected = true, s = "-90E3")
    }

    @Test
    fun example10() {
        checkAnswer(expected = true, s = "3e+7")
    }

    @Test
    fun example11() {
        checkAnswer(expected = true, s = "+6e-1")
    }

    @Test
    fun example12() {
        checkAnswer(expected = true, s = "53.5e93")
    }

    @Test
    fun example13() {
        checkAnswer(expected = true, s = "-123.456e789")
    }

    @Test
    fun example14() {
        checkAnswer(expected = false, s = "e")
    }

    @Test
    fun example15() {
        checkAnswer(expected = false, s = ".")
    }

    @Test
    fun example16() {
        checkAnswer(expected = false, s = "abc")
    }

    @Test
    fun example17() {
        checkAnswer(expected = false, s = "1a")
    }

    @Test
    fun example18() {
        checkAnswer(expected = false, s = "1e")
    }

    @Test
    fun example19() {
        checkAnswer(expected = false, s = "e3")
    }

    @Test
    fun example20() {
        checkAnswer(expected = false, s = "99e2.5")
    }

    @Test
    fun example21() {
        checkAnswer(expected = false, s = "--6")
    }

    @Test
    fun example22() {
        checkAnswer(expected = false, s = "-+3")
    }

    @Test
    fun example23() {
        checkAnswer(expected = false, s = "95a54e53")
    }

    @Test
    fun example24() {
        checkAnswer(expected = true, s = ".1")
    }

    @Test
    fun example25() {
        checkAnswer(expected = false, s = ".")
    }

    @Test
    fun example26() {
        checkAnswer(expected = true, s = "46.e3")
    }
}
