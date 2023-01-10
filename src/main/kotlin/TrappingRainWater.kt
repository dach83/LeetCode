/**
 * Problem description on [LeetCode](https://leetcode.com/problems/trapping-rain-water/)
 */
class TrappingRainWater {

    fun trap(height: IntArray): Int {
        val waterHeight = waterHeight(height)
        return waterVolume(height, waterHeight)
    }

    private fun waterVolume(wallHeight: IntArray, waterHeight: IntArray): Int {
        var result = 0
        for (i in wallHeight.indices) {
            result += waterHeight[i] - wallHeight[i]
        }
        return result
    }

    private fun waterHeight(wallHeight: IntArray): IntArray {
        val leftWaterHeight = leftToRightWaterHeight(wallHeight)
        val rightWaterHeight = rightToLeftWaterHeight(wallHeight)
        val result = IntArray(wallHeight.size)
        for (i in leftWaterHeight.indices) {
            result[i] = minOf(
                leftWaterHeight[i],
                rightWaterHeight[i]
            )
        }
        return result
    }

    // The height of the water if there is a high wall on the right side
    private fun leftToRightWaterHeight(height: IntArray): IntArray {
        var maxHeight = 0
        val result = IntArray(height.size)
        for (i in height.indices) {
            maxHeight = maxOf(height[i], maxHeight)
            result[i] = maxHeight
        }
        return result
    }

    // The height of the water if there is a high wall on the left side
    private fun rightToLeftWaterHeight(height: IntArray): IntArray {
        var maxHeight = 0
        val result = IntArray(height.size)
        for (i in height.size - 1 downTo 0) {
            maxHeight = maxOf(height[i], maxHeight)
            result[i] = maxHeight
        }
        return result
    }
}
