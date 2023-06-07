package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.RemoveDuplicatesFromSortedList
import leetcode.toIntArray
import leetcode.toListNode
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedListTest {

    private fun checkAnswer(expected: IntArray, head: IntArray) {
        val sut = RemoveDuplicatesFromSortedList()

        val actual = sut.deleteDuplicates(head.toListNode()).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 2), head = intArrayOf(1, 1, 2))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(1, 2, 3), head = intArrayOf(1, 1, 2, 3, 3))
    }
}
