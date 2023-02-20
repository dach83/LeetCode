import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArrayIITest {

    private fun checkAnswer(expected: IntArray, nums: IntArray) {
        val sut = RemoveDuplicatesFromSortedArrayII()

        val actual = sut.removeDuplicates(nums)

        assertThat(actual).isEqualTo(expected.size)
        for (i in expected.indices) {
            assertThat(nums[i]).isEqualTo(expected[i])
        }
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 1, 2, 2, 3), nums = intArrayOf(1, 1, 1, 2, 2, 3))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(0, 0, 1, 1, 2, 3, 3), nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3))
    }
}
