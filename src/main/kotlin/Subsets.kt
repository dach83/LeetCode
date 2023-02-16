import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/subsets/)
 */
class Subsets {

    private val answer = mutableListOf<List<Int>>()

    fun subsets(nums: IntArray): List<List<Int>> {
        val stack = Stack<Int>()
        subsetsRecursive(nums, -1, stack)
        return answer
    }

    private fun subsetsRecursive(nums: IntArray, from: Int, stack: Stack<Int>) {
        answer.add(stack.toList())
        for (i in from + 1 until nums.size) {
            stack.add(nums[i])
            subsetsRecursive(nums, i, stack)
            stack.pop()
        }
    }
}
