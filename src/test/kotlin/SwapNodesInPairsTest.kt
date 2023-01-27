import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SwapNodesInPairsTest {

    private fun checkAnswer(expected: IntArray, head: IntArray) {
        val sut = SwapNodesInPairs()

        val actual = sut.swapPairs(head.toListNode()).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(2, 1, 4, 3), head = intArrayOf(1, 2, 3, 4))
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(), head = intArrayOf())
    }

    @Test
    fun example3() {
        checkAnswer(expected = intArrayOf(1), head = intArrayOf(1))
    }
}
