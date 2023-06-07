package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/sort-colors/)
 */
class SortColors {

    fun sortColors(nums: IntArray) {
        val count = IntArray(3)
        for (num in nums) {
            count[num]++
        }

        var ind = 0
        for (num in 0..2) {
            repeat(count[num]) {
                nums[ind++] = num
            }
        }
    }
}
