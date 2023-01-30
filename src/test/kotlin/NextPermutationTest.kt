import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class NextPermutationTest {

    private fun checkAnswer(expected: IntArray, nums: IntArray) {
        val sut = NextPermutation()

        sut.nextPermutation(nums)

        assertThat(nums).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 3, 2), nums = intArrayOf(1, 2, 3))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(1, 2, 3), nums = intArrayOf(3, 2, 1))
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(1, 5, 1), nums = intArrayOf(1, 1, 5))
    }
}
