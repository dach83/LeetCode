import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/largest-rectangle-in-histogram/)
 */
class LargestRectangleInHistogram {

    fun largestRectangleArea(heights: IntArray): Int {
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
