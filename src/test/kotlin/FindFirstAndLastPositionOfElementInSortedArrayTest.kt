import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private fun checkAnswer(expected: IntArray, nums: IntArray, target: Int) {
        val sut = FindFirstAndLastPositionOfElementInSortedArray()

        val actual = sut.searchRange(nums, target)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(3, 4), nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 8)
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(-1, -1), nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 6)
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(-1, -1), nums = intArrayOf(), target = 0)
    }
}
