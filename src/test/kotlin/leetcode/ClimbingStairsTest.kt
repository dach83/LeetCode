package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.ClimbingStairs
import org.junit.jupiter.api.Test

class ClimbingStairsTest {

    private fun checkAnswer(expected: Int, n: Int) {
        val sut = ClimbingStairs()

        val actual = sut.climbStairs(n)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 1, n = 1)
    }

    @Test
    fun example2() {
        checkAnswer(expected = 2, n = 2)
    }

    @Test
    fun example3() {
        checkAnswer(expected = 3, n = 3)
    }

    @Test
    fun example4() {
        checkAnswer(expected = 5, n = 4)
    }

    @Test
    fun example5() {
        checkAnswer(expected = 8, n = 5)
    }

    @Test
    fun example6() {
        checkAnswer(expected = 13, n = 6)
    }
}
