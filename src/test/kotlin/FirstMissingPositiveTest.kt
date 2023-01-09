import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstMissingPositiveTest {

    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 0)
        val sut = FirstMissingPositive()

        val actual = sut.firstMissingPositive(nums)

        assertEquals(expected = 3, actual)
    }

    @Test
    fun example2() {
        val nums = intArrayOf(3, 4, -1, 1)
        val sut = FirstMissingPositive()

        val actual = sut.firstMissingPositive(nums)

        assertEquals(expected = 2, actual)
    }

    @Test
    fun example3() {
        val nums = intArrayOf(7, 8, 9, 11, 12)
        val sut = FirstMissingPositive()

        val actual = sut.firstMissingPositive(nums)

        assertEquals(expected = 1, actual)
    }

    @Test
    fun example4() {
        val nums = intArrayOf(-1, -2, 0)
        val sut = FirstMissingPositive()

        val actual = sut.firstMissingPositive(nums)

        assertEquals(expected = 1, actual)
    }
}
