/**
 * Problem description on [LeetCode](https://leetcode.com/problems/next-permutation/)
 */
class NextPermutation {

    fun nextPermutation(nums: IntArray) {
        var i = nums.count() - 2
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--
        }

        if (i >= 0) {
            var j = nums.count() - 1
            while (nums[j] <= nums[i]) {
                j--
            }
            swap(nums, i, j)
        }

        nums.sort(i + 1)
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }
}
