import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class ThreeSumClosestTest {

    private fun checkAnswer(expected: Int, nums: IntArray, target: Int) {
        val sut = ThreeSumClosest()

        val actual = sut.threeSumClosest(nums, target)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, nums = intArrayOf(-1, 2, 1, -4), target = 1)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 0, nums = intArrayOf(0, 0, 0), target = 1)
    }
}
