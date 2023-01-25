/**
 * Problem description on [LeetCode](https://leetcode.com/problems/container-with-most-water/)
 */
class ContainerWithMostWater {

    private fun area(height: IntArray, left: Int, right: Int): Int {
        return minOf(height[left], height[right]) * (right - left)
    }

    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1

        var bestLeft = left
        var bestRight = right
        var bestArea = area(height, bestLeft, bestRight)

        while (left < right) {
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }

            if (height[bestLeft] <= height[left] && height[bestRight] <= height[right]) {
                val currArea = area(height, left, right)
                if (bestArea < currArea) {
                    bestArea = currArea
                    bestLeft = left
                    bestRight = right
                }
            }
        }

        return bestArea
    }
}
