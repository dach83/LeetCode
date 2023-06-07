/**
 * Problem description on [LeetCode](https://leetcode.com/problems/partition-list/)
 */
class PartitionList {

    fun partition(head: ListNode?, x: Int): ListNode? {
        val list1 = ListNode()
        val list2 = ListNode()

        var h = head
        var l1: ListNode = list1
        var l2: ListNode = list2

        while (h != null) {
            if (h.`val` < x) {
                l1.next = h
                l1 = l1.next!!
            } else {
                l2.next = h
                l2 = l2.next!!
            }
            h = h.next
        }

        l1.next = list2.next
        l2.next = null
        return list1.next
    }
}
