package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/palindrome-number/)
 */
class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || x % 10 == 0 && x != 0) return false

        var a = x
        var b = 0
        while (a > b) {
            b = b * 10 + a % 10
            a /= 10
        }

        return a == b || a == b / 10
    }
}
