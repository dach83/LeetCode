/**
 * Problem description on [LeetCode](https://leetcode.com/problems/two-sum/)
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val sum = nums[i] + nums[j]
                if (sum == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}
