import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class PermutationsIITest {

    private fun checkAnswer(expected: List<List<Int>>, nums: IntArray) {
        val sut = PermutationsII()

        val actual = sut.permuteUnique(nums)

        assertThat(actual).containsExactlyElementsIn(expected)
    }

    @Test
    fun example1() {
        val expected = listOf(
            listOf(1, 1, 2),
            listOf(1, 2, 1),
            listOf(2, 1, 1)
        )
        checkAnswer(expected, intArrayOf(1, 1, 2))
    }

    @Test
    fun example2() {
        val expected = listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1)
        )
        checkAnswer(expected, intArrayOf(1, 2, 3))
    }

    @Test
    fun example3() {
        val expected = listOf(
            listOf(1, 1, 2, 2),
            listOf(1, 2, 1, 2),
            listOf(1, 2, 2, 1),
            listOf(2, 1, 1, 2),
            listOf(2, 1, 2, 1),
            listOf(2, 2, 1, 1)
        )
        checkAnswer(expected, intArrayOf(2, 2, 1, 1))
    }
}
