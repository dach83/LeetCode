package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/add-binary/)
 */
class AddBinary {

    fun addBinary(a: String, b: String): String = buildString {
        var remains = 0
        val maxLength = maxOf(a.length, b.length)
        for (i in 1..maxLength) {
            val aBit = a.getOrElse(a.length - i) { '0' }.bitToDigit()
            val bBit = b.getOrElse(b.length - i) { '0' }.bitToDigit()
            val sum = remains + aBit + bBit
            when (sum) {
                0, 2 -> append('0')
                1, 3 -> append('1')
            }
            remains = if (sum > 1) 1 else 0
        }
        if (remains > 0) {
            append(remains)
        }
        reverse()
    }

    private fun Char.bitToDigit() = if (this == '0') 0 else 1
}
