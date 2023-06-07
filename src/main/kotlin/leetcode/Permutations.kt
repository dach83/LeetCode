package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/permutations/)
 */
class Permutations {

    private val answer = mutableListOf<List<Int>>()

    fun permute(nums: IntArray): List<List<Int>> {
        backtrack(nums, 0)
        return answer
    }

    private fun backtrack(nums: IntArray, pos: Int) {
        if (pos == nums.size) {
            answer.add(nums.toList())
        }

        for (i in pos until nums.size) {
            swap(nums, pos, i)
            backtrack(nums, pos + 1)
            swap(nums, pos, i)
        }
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }
}
