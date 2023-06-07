package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/sqrtx/)
 */
class SqrtX {

    fun mySqrt(x: Int): Int {
        if (x == 0) return 0

        var left = 1
        var right = x
        while (left <= right) {
            val mid = (left + right) / 2
            val div = x / mid
            if (div == mid) {
                return mid
            }
            if (div > mid) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return right
    }
}
