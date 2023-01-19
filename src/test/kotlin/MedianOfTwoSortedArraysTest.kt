import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class MedianOfTwoSortedArraysTest {

    private fun checkAnswer(expected: Double, nums1: IntArray, nums2: IntArray) {
        val sut = MedianOfTwoSortedArrays()

        val actual = sut.findMedianSortedArrays(nums1, nums2)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = 2.00000, nums1 = intArrayOf(1, 3), nums2 = intArrayOf(2))
    }

    @Test
    fun example2() {
        checkAnswer(expected = 2.50000, nums1 = intArrayOf(1, 2), nums2 = intArrayOf(3, 4))
    }
}
