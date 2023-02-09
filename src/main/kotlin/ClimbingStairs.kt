/**
 * Problem description on [LeetCode](https://leetcode.com/problems/climbing-stairs/)
 */
class ClimbingStairs {

    fun climbStairs(n: Int): Int {
        var prev = 0
        var curr = 1
        repeat(n) {
            val temp = curr
            curr += prev
            prev = temp
        }
        return curr
    }
}
