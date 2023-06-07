package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.FindTheIndexOfTheFirstOccurrenceInString
import org.junit.jupiter.api.Test

class FindTheIndexOfTheFirstOccurrenceInStringTest {

    private fun checkAnswer(expected: Int, haystack: String, needle: String) {
        val sut = FindTheIndexOfTheFirstOccurrenceInString()

        val actual = sut.strStr(haystack, needle)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 0, haystack = "sadbutsad", needle = "sad")
    }

    @Test
    fun example2() {
        checkAnswer(expected = -1, haystack = "leetcode", needle = "leeto")
    }
}
