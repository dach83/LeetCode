package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/search-insert-position/)
 */
class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val middle = (left + right) / 2
            if (nums[middle] == target) {
                return middle
            } else if (nums[middle] < target) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return left
    }
}
