import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class RegularExpressionMatchingTest {

    private fun checkAnswer(expected: Boolean, s: String, p: String) {
        val sut = RegularExpressionMatching()

        val actual = sut.isMatch(s, p)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = false, s = "aa", p = "a")
    }

    @Test
    fun example2() {
        checkAnswer(expected = true, s = "aa", p = "a*")
    }

    @Test
    fun example3() {
        checkAnswer(expected = true, s = "ab", p = ".*")
    }
}
