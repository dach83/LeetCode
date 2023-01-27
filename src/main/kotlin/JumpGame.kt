/**
 * Problem description on [LeetCode](https://leetcode.com/problems/jump-game/)
 */
class JumpGame {

    fun canJump(nums: IntArray): Boolean {
        val dp = BooleanArray(nums.size) { false }
        dp[0] = true

        for (i in nums.indices) {
            if (dp[i]) {
                for (k in 1..nums[i]) {
                    if (i + k < dp.size - 1) {
                        dp[i + k] = true
                    } else {
                        return true
                    }
                }
            }
        }

        return dp.last()
    }
}
