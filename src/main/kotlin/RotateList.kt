/**
 * Problem description on [LeetCode](https://leetcode.com/problems/permutation-sequence/)
 */
class RotateList {

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        val size = listSize(head)
        if (size < 2 || k % size == 0) {
            return head
        }

        var fast = head
        repeat(k % size) {
            fast = fast?.next
        }

        var node = head
        while (fast?.next != null) {
            node = node?.next
            fast = fast?.next
        }

        val newHead = node?.next
        node?.next = null
        fast?.next = head
        return newHead
    }

    private fun listSize(head: ListNode?): Int {
        var node = head
        var count = 0
        while (node != null) {
            node = node.next
            count++
        }
        return count
    }
}
