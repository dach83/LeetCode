/**
 * Problem description on [LeetCode](https://leetcode.com/problems/combination-sum-ii/)
 */
class CombinationSumII {

    private val answer = mutableSetOf<List<Int>>()

    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val list = mutableListOf<Int>()
        candidates.sort()
        search(candidates, target, 0, list)
        return answer.toList()
    }

    private fun search(candidates: IntArray, target: Int, start: Int, list: MutableList<Int>) {
        if (target == 0) answer.add(list.toList())
        if (target <= 0) return

        var last = 0
        for (i in start until candidates.size) {
            if (candidates[i] <= target && candidates[i] != last) {
                list.add(candidates[i])
                search(candidates, target - candidates[i], i + 1, list)
                last = list.removeAt(list.lastIndex)
            }
        }
    }
}
