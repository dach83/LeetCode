import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class MaximumSubarrayTest {

    private fun checkAnswer(expected: Int, nums: IntArray) {
        val sut = MaximumSubarray()

        val actual = sut.maxSubArray(nums)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 6, nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 1, nums = intArrayOf(1))
    }

    @Test
    fun example3() {
        checkAnswer(expected = 23, nums = intArrayOf(5, 4, -1, 7, 8))
    }

    @Test
    fun example4() {
        checkAnswer(expected = 6, nums = intArrayOf(1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4))
    }
}
