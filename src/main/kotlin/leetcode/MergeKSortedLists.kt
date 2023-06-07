package leetcode

import java.util.*

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)
 */
class MergeKSortedLists {

    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val start = ListNode()
        var last = start

        val compareByVal: Comparator<ListNode> = compareBy { it.`val` }
        val queue = PriorityQueue(compareByVal)
        queue.addAll(lists.filterNotNull())
        while (queue.isNotEmpty()) {
            last.next = queue.remove()
            last = last.next!!
            if (last.next != null) {
                queue.add(last.next)
            }
        }

        return start.next
    }
}
