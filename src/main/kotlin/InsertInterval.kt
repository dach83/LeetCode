/**
 * Problem description on [LeetCode](https://leetcode.com/problems/insert-interval/)
 */
class InsertInterval {

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        return merge(intervals + newInterval)
    }

    private fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }

        val answer = mutableListOf(intervals[0])
        for (i in 1 until intervals.size) {
            if (intersect(answer.last(), intervals[i])) {
                mergeLast(answer.last(), intervals[i])
            } else {
                answer.add(intervals[i])
            }
        }
        return answer.toTypedArray()
    }

    private fun intersect(interval1: IntArray, interval2: IntArray): Boolean {
        return interval1[1] >= interval2[0]
    }

    private fun mergeLast(last: IntArray, interval: IntArray) {
        last[1] = maxOf(last[1], interval[1])
    }
}
