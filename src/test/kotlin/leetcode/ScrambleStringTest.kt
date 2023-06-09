package leetcode

import ScrambleString
import com.google.common.truth.Truth
import org.junit.jupiter.api.Test

class ScrambleStringTest {

    private fun checkAnswer(expected: Boolean, s1: String, s2: String) {
        val sut = ScrambleString()

        val actual = sut.isScramble(s1, s2)

        Truth.assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = true, s1 = "great", s2 = "rgeat")
    }

    @Test
    fun example2() {
        checkAnswer(expected = false, s1 = "abcde", s2 = "caebd")
    }

    @Test
    fun example3() {
        checkAnswer(expected = true, s1 = "a", s2 = "a")
    }
}
