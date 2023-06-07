package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/jump-game-ii/)
 */
class JumpGameII {

    fun jump(nums: IntArray): Int {
        val dp = IntArray(nums.size) {
            Int.MAX_VALUE
        }

        dp[0] = 0
        for (from in 0 until nums.size - 1) {
            for (jumpLength in 1..nums[from]) {
                val dest = from + jumpLength
                if (dest >= nums.size) break
                dp[dest] = minOf(dp[dest], dp[from] + 1)
            }
        }

        return dp.last()
    }
}
