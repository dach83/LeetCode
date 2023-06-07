package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/powx-n/)
 */
class PowXN {

    fun myPow(x: Double, n: Int): Double =
        if (x == 1.0 || n == 0) {
            1.0
        } else if (x == 0.0) {
            0.0
        } else if (n == Int.MIN_VALUE) {
            myPow(x * x, n / 2)
        } else if (n < 0L) {
            myPow(1 / x, -n)
        } else if (n % 2 == 0) {
            myPow(x * x, n / 2)
        } else {
            x * myPow(x * x, n / 2)
        }
}
