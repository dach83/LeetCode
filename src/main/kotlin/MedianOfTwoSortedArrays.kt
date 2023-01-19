/**
 * Problem description on [LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)
 */
class MedianOfTwoSortedArrays {

    private fun elem(nums: IntArray, ind: Int): Int = if (ind < nums.size) {
        nums[ind]
    } else {
        Int.MAX_VALUE
    }

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val size = nums1.size + nums2.size

        val med1: Int
        val med2: Int
        if (size % 2 == 0) {
            med1 = size / 2 - 1
            med2 = med1 + 1
        } else {
            med1 = size / 2
            med2 = med1
        }

        var count = 0
        var num: Int
        var num1 = 0
        var num2 = 0
        var ind1 = 0
        var ind2 = 0

        while (count < size) {
            if (elem(nums1, ind1) < elem(nums2, ind2)) {
                num = elem(nums1, ind1)
                ind1++
            } else {
                num = elem(nums2, ind2)
                ind2++
            }

            if (count > med2) break
            if (count == med1) num1 = num
            if (count == med2) num2 = num
            count++
        }
        return (num1 + num2) / 2.0
    }
}
