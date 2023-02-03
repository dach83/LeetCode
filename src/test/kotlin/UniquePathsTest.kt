import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class UniquePathsTest {

    private fun checkAnswer(expected: Int, m: Int, n: Int) {
        val sut = UniquePaths()

        val actual = sut.uniquePaths(m, n)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 28, m = 3, n = 7)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 3, m = 3, n = 2)
    }
}
