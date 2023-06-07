package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.CountAndSay
import org.junit.jupiter.api.Test

class CountAndSayTest {

    private fun checkAnswer(expected: String, n: Int) {
        val sut = CountAndSay()

        val actual = sut.countAndSay(n)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "1", n = 1)
    }

    @Test
    fun example2() {
        checkAnswer(expected = "1211", n = 4)
    }
}
