import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SimplifyPathTest {

    private fun checkAnswer(expected: String, path: String) {
        val sut = SimplifyPath()

        val actual = sut.simplifyPath(path)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "/home", path = "/home/")
    }

    @Test
    fun example2() {
        checkAnswer(expected = "/", path = "/../")
    }

    @Test
    fun example3() {
        checkAnswer(expected = "/home/foo", path = "/home//foo/")
    }

    @Test
    fun example4() {
        checkAnswer(expected = "/home", path = "/home/foo/..")
    }

    @Test
    fun example5() {
        checkAnswer(expected = "/c", path = "/a/./b/../../c/")
    }
}
