package leetcode

import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/combinations/)
 */
class Combinations {

    private val answer = mutableListOf<List<Int>>()

    fun combine(n: Int, k: Int): List<List<Int>> {
        val stack = Stack<Int>()
        combineRecursive(n, k, 0, stack)
        return answer
    }

    private fun combineRecursive(n: Int, k: Int, from: Int, stack: Stack<Int>) {
        if (k == 0) {
            answer.add(stack.toList())
            return
        }

        for (num in from + 1..n - k + 1) {
            stack.add(num)
            combineRecursive(n, k - 1, num, stack)
            stack.pop()
        }
    }
}
