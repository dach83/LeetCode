/**
 * Problem description on [LeetCode](https://leetcode.com/problems/reverse-nodes-in-k-group/)
 */
class ReverseNodesInKGroup {

    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        val kNode = getKNode(head, k)
        if (head == null || kNode == null || head == kNode) {
            return head
        }

        kNode.next = reverseKGroup(kNode.next, k)
        return reverse(head, kNode)
    }

    private fun getKNode(head: ListNode?, k: Int): ListNode? {
        if (head == null || k == 1) {
            return head
        }

        return getKNode(head.next, k - 1)
    }

    private fun reverse(head: ListNode?, last: ListNode?): ListNode? {
        val headNext = head?.next
        val lastNext = last?.next

        last?.next = head
        head?.next = lastNext
        if (headNext == last) {
            return headNext
        }

        return reverse(headNext, last)
    }
}
