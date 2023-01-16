import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TwoSumTest {

    private fun checkAnswer(expected: IntArray, nums: IntArray, target: Int) {
        val sut = TwoSum()

        val actual = sut.twoSum(nums, target)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(0, 1), nums = intArrayOf(2, 7, 11, 15), target = 9)
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(1, 2), nums = intArrayOf(3, 2, 4), target = 6)
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(0, 1), nums = intArrayOf(3, 3), target = 6)
    }
}
