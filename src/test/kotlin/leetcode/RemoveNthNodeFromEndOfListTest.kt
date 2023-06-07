package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.RemoveNthNodeFromEndOfList
import leetcode.toIntArray
import leetcode.toListNode
import org.junit.jupiter.api.Test

class RemoveNthNodeFromEndOfListTest {

    private fun checkAnswer(expected: IntArray, head: IntArray, n: Int) {
        val sut = RemoveNthNodeFromEndOfList()

        val actual = sut.removeNthFromEnd(head.toListNode(), n).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 2, 3, 5), head = intArrayOf(1, 2, 3, 4, 5), n = 2)
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(), head = intArrayOf(1), n = 1)
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(1), head = intArrayOf(1, 2), n = 1)
    }
}
