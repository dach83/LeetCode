import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class FourSumTest {

    private fun checkAnswer(expected: List<List<Int>>, nums: IntArray, target: Int) {
        val sut = FourSum()

        val actual = sut.fourSum(nums, target)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(-2, -1, 1, 2),
            listOf(-2, 0, 0, 2),
            listOf(-1, 0, 0, 1)
        )
        checkAnswer(expected = expected, nums = intArrayOf(1, 0, -1, 0, -2, 2), target = 0)
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf(2, 2, 2, 2)
        )
        checkAnswer(expected = expected, nums = intArrayOf(2, 2, 2, 2, 2), target = 8)
    }
}
