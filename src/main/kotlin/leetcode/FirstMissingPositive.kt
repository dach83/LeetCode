package leetcode

import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/first-missing-positive/)
 */
class FirstMissingPositive {

    fun firstMissingPositive(nums: IntArray): Int {
        val positiveNums = nums.filter { it > 0 }
        if (positiveNums.isEmpty()) {
            return 1 // all numbers are negative
        }

        val positiveNumsSet = TreeSet(positiveNums)

        // tree set sorts the elements in ascending order,
        // so the first element is the minimum number and
        // the last element is the maximum number
        val minNum = positiveNumsSet.first()
        val maxNum = positiveNumsSet.last()

        // check first missing number before minNum
        if (minNum > 1) {
            return 1
        }

        // check first missing number between minNum and maxNum
        for (n in minNum..maxNum) {
            if (!positiveNumsSet.contains(n)) {
                return n
            }
        }

        // first missing number after maxNum
        return maxNum + 1
    }
}
