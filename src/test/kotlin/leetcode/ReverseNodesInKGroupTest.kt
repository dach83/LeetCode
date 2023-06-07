package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.ReverseNodesInKGroup
import leetcode.toIntArray
import leetcode.toListNode
import org.junit.jupiter.api.Test

class ReverseNodesInKGroupTest {

    private fun checkAnswer(expected: IntArray, head: IntArray, k: Int) {
        val sut = ReverseNodesInKGroup()

        val actual = sut.reverseKGroup(head.toListNode(), k).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(2, 1, 4, 3, 5), head = intArrayOf(1, 2, 3, 4, 5), k = 2)
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(3, 2, 1, 4, 5), head = intArrayOf(1, 2, 3, 4, 5), k = 3)
    }
}
