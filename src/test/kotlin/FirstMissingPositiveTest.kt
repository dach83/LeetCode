import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class FirstMissingPositiveTest {

    private fun checkAnswer(expected: Int, nums: IntArray) {
        val sut = FirstMissingPositive()

        val actual = sut.firstMissingPositive(nums)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 3, nums = intArrayOf(1, 2, 0))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 2, nums = intArrayOf(3, 4, -1, 1))
    }

    @Test
    fun example3() {
        checkAnswer(expected = 1, nums = intArrayOf(7, 8, 9, 11, 12))
    }

    @Test
    fun example4() {
        checkAnswer(expected = 1, nums = intArrayOf(-1, -2, 0))
    }
}
