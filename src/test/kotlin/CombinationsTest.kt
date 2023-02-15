import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class CombinationsTest {

    private fun checkAnswer(expected: List<List<Int>>, n: Int, k: Int) {
        val sut = Combinations()

        val actual = sut.combine(n, k)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(1, 2),
            listOf(1, 3),
            listOf(1, 4),
            listOf(2, 3),
            listOf(2, 4),
            listOf(3, 4)
        )
        checkAnswer(expected = expected, n = 4, k = 2)
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf(1)
        )
        checkAnswer(expected = expected, n = 1, k = 1)
    }
}
