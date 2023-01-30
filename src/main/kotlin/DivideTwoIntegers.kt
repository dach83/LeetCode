/**
 * Problem description on [LeetCode](https://leetcode.com/problems/divide-two-integers/)
 */
class DivideTwoIntegers {

    private fun divideNegative(dividend: Int, divisor: Int): Int {
        if (dividend > divisor) return 0

        var sum = divisor
        var count = 1

        while (sum + sum in dividend..-1) {
            sum += sum
            count += count
        }

        return count + divideNegative(dividend - sum, divisor)
    }

    fun divide(dividend: Int, divisor: Int): Int {
        if (divisor == 0) return Int.MAX_VALUE
        if (divisor == -1 && dividend == Int.MIN_VALUE) return Int.MAX_VALUE

        val isNegativeResult = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)

        val negativeDividend = if (dividend < 0) dividend else -dividend
        val negativeDivisor = if (divisor < 0) divisor else -divisor
        val result = divideNegative(negativeDividend, negativeDivisor)
        return if (isNegativeResult) -result else result
    }
}
