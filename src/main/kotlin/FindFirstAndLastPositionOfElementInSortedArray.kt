/**
 * Problem description on [LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 */
class FindFirstAndLastPositionOfElementInSortedArray {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val left = leftBinarySearch(nums, target)
        if (left == nums.size || nums[left] != target) {
            return intArrayOf(-1, -1)
        }
        val right = leftBinarySearch(nums, target + 1) - 1
        return intArrayOf(left, right)
    }

    private fun leftBinarySearch(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size
        while (left < right) {
            val middle = (left + right) / 2
            if (nums[middle] < target) {
                left = middle + 1
            } else {
                right = middle
            }
        }
        return left
    }
}
