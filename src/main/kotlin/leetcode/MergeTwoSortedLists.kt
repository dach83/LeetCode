package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)
 */
class MergeTwoSortedLists {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val start = ListNode(0)
        var last = start
        var curr1 = list1
        var curr2 = list2

        while (curr1 != null && curr2 != null) {
            if (curr1.`val` < curr2.`val`) {
                last.next = curr1
                curr1 = curr1.next
            } else {
                last.next = curr2
                curr2 = curr2.next
            }
            last = last.next!!
        }

        if (curr1 != null) {
            last.next = curr1
        } else {
            last.next = curr2
        }

        return start.next
    }
}
