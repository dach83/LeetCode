/**
 * Problem description on [LeetCode](https://leetcode.com/problems/add-two-numbers/)
 */
class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var a = l1
        var b = l2
        val root = ListNode(0)
        var curr = root
        var remains = 0
        while (a != null || b != null) {
            val aVal = a?.`val` ?: 0
            val bVal = b?.`val` ?: 0
            val sum = aVal + bVal + remains
            remains = sum / 10

            curr.next = ListNode(sum % 10)
            curr = curr.next!!

            a = a?.next
            b = b?.next
        }

        if (remains > 0) {
            curr.next = ListNode(remains)
        }

        return root.next
    }
}
