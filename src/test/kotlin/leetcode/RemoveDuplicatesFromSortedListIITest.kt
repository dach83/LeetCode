package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.RemoveDuplicatesFromSortedListII
import leetcode.toIntArray
import leetcode.toListNode
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedListIITest {

    private fun checkAnswer(expected: IntArray, head: IntArray) {
        val sut = RemoveDuplicatesFromSortedListII()

        val actual = sut.deleteDuplicates(head.toListNode()).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 2, 5), head = intArrayOf(1, 2, 3, 3, 4, 4, 5))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(2, 3), head = intArrayOf(1, 1, 1, 2, 3))
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(1), head = intArrayOf(1, 2, 2))
    }
}
