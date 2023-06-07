package leetcode

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class MergeKSortedListsTest {

    private fun checkAnswer(expected: IntArray, lists: List<IntArray>) {
        val sut = MergeKSortedLists()

        val actual = sut.mergeKLists(lists.map { it.toListNode() }.toTypedArray()).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val lists = listOf(
            intArrayOf(1, 4, 5),
            intArrayOf(1, 3, 4),
            intArrayOf(2, 6)
        )
        checkAnswer(expected = intArrayOf(1, 1, 2, 3, 4, 4, 5, 6), lists = lists)
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(), lists = emptyList())
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(), lists = listOf())
    }
}
