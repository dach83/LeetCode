package leetcode

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

fun IntArray.toListNode(): ListNode? {
    var node: ListNode? = null
    reversed().forEach() { num ->
        node = ListNode(num).apply { next = node }
    }
    return node
}

fun ListNode?.toIntArray(): IntArray {
    var node: ListNode? = this
    val list = mutableListOf<Int>()
    while (node != null) {
        list.add(node.`val`)
        node = node.next
    }
    return list.toIntArray()
}
