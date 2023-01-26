/**
 * Problem description on [LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */
class RemoveNthNodeFromEndOfList {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val start: ListNode = ListNode().apply { next = head }
        var fast: ListNode? = start
        var slow: ListNode? = start

        for (i in 0..n) {
            fast = fast?.next
        }

        while (fast != null) {
            slow = slow?.next
            fast = fast.next
        }

        slow?.next = slow?.next?.next
        return start.next
    }
}
