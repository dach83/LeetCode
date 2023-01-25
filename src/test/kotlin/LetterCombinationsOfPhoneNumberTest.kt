import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class LetterCombinationsOfPhoneNumberTest {

    private fun checkAnswer(expected: List<String>, digits: String) {
        val sut = LetterCombinationsOfPhoneNumber()

        val actual = sut.letterCombinations(digits)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        checkAnswer(expected = expected, digits = "23")
    }

    @Test
    fun example2() {
        checkAnswer(expected = emptyList(), digits = "")
    }

    @Test
    fun example3() {
        val expected = listOf("a", "b", "c")
        checkAnswer(expected = expected, digits = "2")
    }
}
