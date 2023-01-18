import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class JumpGameIITest {

    private fun checkAnswer(expected: Int, nums: IntArray) {
        val sut = JumpGameII()

        val actual = sut.jump(nums)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2, nums = intArrayOf(2, 3, 1, 1, 4))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 2, nums = intArrayOf(2, 3, 0, 1, 4))
    }

    @Test
    fun example3() {
        checkAnswer(expected = 1, nums = intArrayOf(1, 2))
    }
}
