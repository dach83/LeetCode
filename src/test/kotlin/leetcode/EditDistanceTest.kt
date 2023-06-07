package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.EditDistance
import org.junit.jupiter.api.Test

class EditDistanceTest {

    private fun checkAnswer(expected: Int, word1: String, word2: String) {
        val sut = EditDistance()

        val actual = sut.minDistance(word1, word2)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 3, word1 = "horse", word2 = "ros")
    }

    @Test
    fun example2() {
        checkAnswer(expected = 5, word1 = "intention", word2 = "execution")
    }

    @Test
    fun example3() {
        checkAnswer(expected = 10, word1 = "zoologicoarchaeologist", word2 = "zoogeologist")
    }
}
