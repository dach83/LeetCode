package leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class GroupAnagramsTest {

    private fun checkAnswer(expected: List<List<String>>, strs: Array<String>) {
        val sut = GroupAnagrams()

        val actual = sut.groupAnagrams(strs)

        val sortedActual = actual.map { it.sorted() }
        assertThat(sortedActual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val expected = listOf(
            listOf("bat"),
            listOf("nat", "tan"),
            listOf("ate", "eat", "tea")
        )
        checkAnswer(expected = expected, strs = strs)
    }

    @Test
    fun example2() {
        val strs = arrayOf("")
        val expected = listOf(
            listOf("")
        )
        checkAnswer(expected = expected, strs = strs)
    }

    @Test
    fun example3() {
        val strs = arrayOf("a")
        val expected = listOf(
            listOf("a")
        )
        checkAnswer(expected = expected, strs = strs)
    }
}
