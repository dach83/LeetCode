package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)
 */
class RemoveDuplicatesFromSortedListII {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        val start = ListNode()
        var last = start

        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            if (prev?.`val` != curr.`val` && curr.`val` != curr.next?.`val`) {
                last.next = curr
                last = curr
            }
            prev = curr
            curr = curr.next
            last.next = null
        }

        return start.next
    }
}
