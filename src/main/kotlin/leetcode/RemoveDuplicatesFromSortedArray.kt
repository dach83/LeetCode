package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 */
class RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        var next = 1
        var curr = 0
        while (next < nums.count()) {
            if (nums[curr] == nums[next]) {
                next++
            } else {
                curr++
                nums[curr] = nums[next]
                next++
            }
        }

        return curr + 1
    }
}
