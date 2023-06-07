package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/remove-element/)
 */
class RemoveElement {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var insertIndex = 0
        for (i in 0 until nums.count()) {
            if (nums[i] != `val`) {
                nums[insertIndex] = nums[i]
                insertIndex++
            }
        }
        return insertIndex
    }
}
