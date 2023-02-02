import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class PermutationSequenceTest {

    private fun checkAnswer(expected: String, n: Int, k: Int) {
        val sut = PermutationSequence()

        val actual = sut.getPermutation(n, k)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "213", n = 3, k = 3)
    }

    @Test
    fun example2() {
        checkAnswer(expected = "2314", n = 4, k = 9)
    }

    @Test
    fun example3() {
        checkAnswer(expected = "123", n = 3, k = 1)
    }
}
