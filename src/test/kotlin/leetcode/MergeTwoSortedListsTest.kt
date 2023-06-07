package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.MergeTwoSortedLists
import leetcode.toIntArray
import leetcode.toListNode
import org.junit.jupiter.api.Test

class MergeTwoSortedListsTest {

    private fun checkAnswer(expected: IntArray, list1: IntArray, list2: IntArray) {
        val sut = MergeTwoSortedLists()

        val actual = sut.mergeTwoLists(list1.toListNode(), list2.toListNode()).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 1, 2, 3, 4, 4), list1 = intArrayOf(1, 2, 4), list2 = intArrayOf(1, 3, 4))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(), list1 = intArrayOf(), list2 = intArrayOf())
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(0), list1 = intArrayOf(), list2 = intArrayOf(0))
    }
}
