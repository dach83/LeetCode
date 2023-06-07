package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */
class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var curr = head
        while (curr != null) {
            if (curr.`val` == curr.next?.`val`) {
                curr.next = curr.next?.next
            } else {
                curr = curr.next
            }
        }
        return head
    }
}
