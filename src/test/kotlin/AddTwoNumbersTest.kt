import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    private fun checkAnswer(expected: IntArray, l1: IntArray, l2: IntArray) {
        val sut = AddTwoNumbers()

        val actual = sut.addTwoNumbers(l1.toListNode(), l2.toListNode()).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(intArrayOf(7, 0, 8), intArrayOf(2, 4, 3), intArrayOf(5, 6, 4))
    }

    @Test
    fun example2() {
        checkAnswer(intArrayOf(0), intArrayOf(0), intArrayOf(0))
    }

    @Test
    fun example3() {
        checkAnswer(intArrayOf(8, 9, 9, 9, 0, 0, 0, 1), intArrayOf(9, 9, 9, 9, 9, 9, 9), intArrayOf(9, 9, 9, 9))
    }
}
