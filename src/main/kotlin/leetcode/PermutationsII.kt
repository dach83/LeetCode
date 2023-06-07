package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/permutations-ii/)
 */
class PermutationsII {

    private val answer = mutableListOf<List<Int>>()

    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val numsCount = mutableMapOf<Int, Int>()
        nums.forEach { num ->
            numsCount.compute(num) { _, count ->
                if (count == null) 1 else count + 1
            }
        }

        val list = mutableListOf<Int>()
        backtrack(numsCount, list, nums.size)
        return answer
    }

    private fun backtrack(numsCount: MutableMap<Int, Int>, list: MutableList<Int>, answerSize: Int) {
        if (list.size == answerSize) {
            answer.add(list.toList())
        }

        for ((num, count) in numsCount) {
            if (count == 0) continue

            numsCount[num] = count - 1
            list.add(num)
            backtrack(numsCount, list, answerSize)
            list.removeAt(list.lastIndex)
            numsCount[num] = count
        }
    }
}
