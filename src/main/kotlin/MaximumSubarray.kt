/**
 * Problem description on [LeetCode](https://leetcode.com/problems/maximum-subarray/)
 */
class MaximumSubarray {

    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var max = Int.MIN_VALUE

        for (num in nums) {
            sum = maxOf(num, sum + num)
            max = maxOf(max, sum)
        }

        return max
    }
}
