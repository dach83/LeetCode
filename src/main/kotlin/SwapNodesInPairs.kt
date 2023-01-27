/**
 * Problem description on [LeetCode](https://leetcode.com/problems/swap-nodes-in-pairs/)
 */
class SwapNodesInPairs {

    fun swapPairs(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }

        val tmp = head.next
        head.next = swapPairs(head.next?.next)
        tmp?.next = head

        return tmp
    }
}
