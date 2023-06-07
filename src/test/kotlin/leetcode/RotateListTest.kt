package leetcode

import com.google.common.truth.Truth.assertThat
import leetcode.RotateList
import leetcode.toIntArray
import leetcode.toListNode
import org.junit.jupiter.api.Test

class RotateListTest {

    private fun checkAnswer(expected: IntArray, head: IntArray, k: Int) {
        val sut = RotateList()

        val actual = sut.rotateRight(head.toListNode(), k).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(4, 5, 1, 2, 3), head = intArrayOf(1, 2, 3, 4, 5), k = 2)
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(2, 0, 1), head = intArrayOf(0, 1, 2), k = 4)
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(1), head = intArrayOf(1), k = 4)
    }

    @Test
    fun example4() {
        checkAnswer(expected = intArrayOf(1), head = intArrayOf(1), k = 4)
    }

    @Test
    fun example5() {
        checkAnswer(expected = intArrayOf(1, 2), head = intArrayOf(1, 2), k = 2)
    }
}
