/**
 * Problem description on [LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/)
 */
class SearchInRotatedSortedArray {

    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) {
            return -1
        }

        // not rotated
        if (nums.first() < nums.last()) {
            return binarySearch(nums, 0, nums.size, target)
        }

        // rotated
        val k = minIndex(nums)
        return if (target in nums[k]..nums.last()) {
            binarySearch(nums, k, nums.size, target)
        } else {
            binarySearch(nums, 0, k, target)
        }
    }

    private fun binarySearch(nums: IntArray, first: Int, last: Int, target: Int): Int {
        var left = first
        var right = last - 1
        while (left <= right) {
            val middle = (left + right) / 2
            if (target == nums[middle]) {
                return middle
            } else if (target < nums[middle]) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return -1
    }

    private fun minIndex(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left + 1 < right) {
            val middle = (left + right) / 2
            if (nums[left] < nums[middle]) {
                left = middle
            } else {
                right = middle
            }
        }
        return right
    }
}
