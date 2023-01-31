import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SearchInRotatedSortedArrayTest {

    private fun checkAnswer(expected: Int, nums: IntArray, target: Int) {
        val sut = SearchInRotatedSortedArray()

        val actual = sut.search(nums, target)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 4, nums = intArrayOf(4, 5, 6, 7, 0, 1, 2), target = 0)
    }

    @Test
    fun example2() {
        checkAnswer(expected = -1, nums = intArrayOf(4, 5, 6, 7, 0, 1, 2), target = 3)
    }

    @Test
    fun example3() {
        checkAnswer(expected = -1, nums = intArrayOf(1), target = 0)
    }
}
