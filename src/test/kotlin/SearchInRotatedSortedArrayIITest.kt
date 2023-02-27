import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SearchInRotatedSortedArrayIITest {

    private fun checkAnswer(expected: Boolean, nums: IntArray, target: Int) {
        val sut = SearchInRotatedSortedArrayII()

        val actual = sut.search(nums, target)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = true, nums = intArrayOf(2, 5, 6, 0, 0, 1, 2), target = 0)
    }

    @Test
    fun example2() {
        checkAnswer(expected = false, nums = intArrayOf(2, 5, 6, 0, 0, 1, 2), target = 3)
    }

    @Test
    fun example3() {
        checkAnswer(expected = true, nums = intArrayOf(1, 0, 1, 1, 1), target = 0)
    }

    @Test
    fun example4() {
        checkAnswer(
            expected = true,
            nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1),
            target = 2
        )
    }
}
