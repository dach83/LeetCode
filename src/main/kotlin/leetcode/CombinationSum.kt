package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/combination-sum/)
 */
class CombinationSum {

    private val answer = mutableSetOf<List<Int>>()

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val list = mutableListOf<Int>()
        candidates.sort()
        search(candidates, target, 0, list)
        return answer.toList()
    }

    private fun search(candidates: IntArray, target: Int, start: Int, list: MutableList<Int>) {
        if (target == 0) answer.add(list.toList())
        if (target <= 0) return

        for (i in start until candidates.size) {
            if (candidates[i] <= target) {
                list.add(candidates[i])
                search(candidates, target - candidates[i], i, list)
                list.removeAt(list.lastIndex)
            }
        }
    }
}
