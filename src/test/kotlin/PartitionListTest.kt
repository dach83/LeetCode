import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class PartitionListTest {

    private fun checkAnswer(expected: IntArray, head: IntArray, x: Int) {
        val sut = PartitionList()

        val actual = sut.partition(head.toListNode(), x).toIntArray()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = intArrayOf(1, 2, 2, 4, 3, 5), head = intArrayOf(1, 4, 3, 2, 5, 2), 3)
    }

    @Test
    fun example2() {
        checkAnswer(expected = intArrayOf(1, 2), head = intArrayOf(2, 1), 2)
    }
}
