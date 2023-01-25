/**
 * Problem description on [LeetCode](https://leetcode.com/problems/3sum/)
 */
class ThreeSum {

    private val res = mutableListOf<List<Int>>()

    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i - 1] == nums[i]) continue
            twoSum(nums, i + 1, -nums[i])
        }
        return res
    }

    private fun twoSum(nums: IntArray, startFrom: Int, target: Int) {
        var l = startFrom
        var r = nums.size - 1
        while (l < r) {
            if (nums[l] + nums[r] == target) {
                res.add(listOf(-target, nums[l], nums[r]))
                l++
                r--
                while (l < r && nums[l - 1] == nums[l]) l++
                while (l < r && nums[r + 1] == nums[r]) r--
            } else if (nums[l] + nums[r] < target) {
                l++
            } else {
                r--
            }
        }
    }
}
