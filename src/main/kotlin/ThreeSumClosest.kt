/**
 * Problem description on [LeetCode](https://leetcode.com/problems/3sum-closest/)
 */
class ThreeSumClosest {

    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()
        var sum = Int.MAX_VALUE
        var diff = Int.MAX_VALUE

        for (i in 0 until nums.size - 2) {
            var l = i + 1
            var r = nums.lastIndex
            while (l < r) {
                val temp = nums[i] + nums[l] + nums[r]
                if (temp == target) {
                    return temp
                } else if (temp < target) {
                    if (target - temp < diff) {
                        sum = temp
                        diff = target - temp
                    }
                    l++
                } else {
                    if (temp - target < diff) {
                        sum = temp
                        diff = temp - target
                    }
                    r--
                }
            }
        }

        return sum
    }
}
