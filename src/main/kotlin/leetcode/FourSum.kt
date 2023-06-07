package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/4sum/)
 */
class FourSum {

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val res = mutableSetOf<List<Int>>()
        nums.sort()
        for (a in 0 until nums.size - 3) {
            for (b in a + 1 until nums.size - 2) {
                var c = b + 1
                var d = nums.lastIndex
                while (c < d) {
                    val sum = nums[a].toDouble() + nums[b] + nums[c] + nums[d]
                    if (sum.toLong() == target.toLong()) {
                        res.add(listOf(nums[a], nums[b], nums[c], nums[d]))
                        c++
                        d--
                    } else if (sum < target) {
                        c++
                    } else {
                        d--
                    }
                }
            }
        }
        return res.toList()
    }
}
