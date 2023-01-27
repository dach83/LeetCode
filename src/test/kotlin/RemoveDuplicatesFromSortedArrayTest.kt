import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArrayTest {

    private fun checkAnswer(expected: Int, nums: IntArray) {
        val sut = RemoveDuplicatesFromSortedArray()

        val actual = sut.removeDuplicates(nums)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, nums = intArrayOf(1, 1, 2))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 5, nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
    }
}
