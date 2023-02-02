/**
 * Problem description on [LeetCode](https://leetcode.com/problems/permutation-sequence/)
 */
class PermutationSequence {

    fun getPermutation(n: Int, k: Int): String {
        val nums = IntArray(n) { it + 1 }

        repeat(k - 1) {
            nextPermutation(nums)
        }

        return nums.joinToString("")
    }

    private fun nextPermutation(nums: IntArray) {
        var i = nums.count() - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--
        }

        if (i >= 0) {
            var j = nums.count() - 1
            while (nums[i] >= nums[j]) {
                j--
            }
            swap(nums, i, j)
        }

        nums.sort(i + 1)
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}
