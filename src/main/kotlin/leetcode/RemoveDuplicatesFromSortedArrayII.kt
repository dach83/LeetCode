package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
 */
class RemoveDuplicatesFromSortedArrayII {

    fun removeDuplicates(nums: IntArray): Int {
        var left = 0
        var count = 1
        for (i in 1..nums.lastIndex) {
            if (nums[left] == nums[i]) {
                count++
            } else {
                count = 1
            }
            if (count < 3) {
                left++
                nums[left] = nums[i]
            }
        }
        return left + 1
    }
}
