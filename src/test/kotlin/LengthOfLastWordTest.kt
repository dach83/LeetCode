import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class LengthOfLastWordTest {

    private fun checkAnswer(expected: Int, s: String) {
        val sut = LengthOfLastWord()

        val actual = sut.lengthOfLastWord(s)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 5, s = "Hello World")
    }

    @Test
    fun example2() {
        checkAnswer(expected = 4, s = "   fly me   to   the moon  ")
    }

    @Test
    fun example3() {
        checkAnswer(expected = 6, s = "luffy is still joyboy")
    }
}
