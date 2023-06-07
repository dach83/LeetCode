package leetcode

import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/maximal-rectangle/)
 */
class MaximalRectangle {

    fun maximalRectangle(matrix: Array<CharArray>): Int {
        val rowCount = matrix.size
        val colCount = matrix[0].size
        val heights = Array(rowCount + 1) {
            IntArray(colCount)
        }

        var maxArea = 0
        for (row in 1..rowCount) {
            for (col in 0 until colCount) {
                heights[row][col] = if (matrix[row - 1][col] == '0') 0 else heights[row - 1][col] + 1
                maxArea = maxOf(maxArea, largestRectangleArea(heights[row]))
            }
        }
        return maxArea
    }

    private fun largestRectangleArea(heights: IntArray): Int {
        var maxArea = 0
        val stack = Stack<Int>()
        for (i in 0..heights.size) {
            val currHeight = heights.getOrElse(i) { 0 }
            while (!stack.empty() && currHeight < heights[stack.peek()]) {
                val top = stack.pop()
                val width = if (stack.empty()) i else i - stack.peek() - 1
                val area = heights[top] * width
                maxArea = maxOf(area, maxArea)
            }
            stack.push(i)
        }
        return maxArea
    }
}
