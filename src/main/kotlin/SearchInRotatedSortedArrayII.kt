/**
 * Problem description on [LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
 */
class SearchInRotatedSortedArrayII {

    fun search(nums: IntArray, target: Int): Boolean {
        return binarySearch(nums, target, 0, nums.lastIndex)
    }

    private fun binarySearch(nums: IntArray, target: Int, left: Int, right: Int): Boolean {
        if (left > right) return false

        val mid = (left + right) / 2
        return if (nums[mid] == target) {
            true
        } else if (nums[left] <= target && target < nums[mid]) {
            binarySearch(nums, target, left, mid - 1)
        } else if (nums[mid] < target && target < nums[right]) {
            binarySearch(nums, target, mid + 1, right)
        } else {
            binarySearch(nums, target, left, mid - 1) ||
                binarySearch(nums, target, mid + 1, right)
        }
    }
}
