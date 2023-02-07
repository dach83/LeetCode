/**
 * Problem description on [LeetCode](https://leetcode.com/problems/plus-one/)
 */
class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        var remains = 1
        val result = mutableListOf<Int>()
        for (i in digits.size - 1 downTo 0) {
            val sum = digits[i] + remains
            result.add(sum % 10)
            remains = sum / 10
        }
        if (remains > 0) {
            result.add(remains)
        }
        return result.reversed().toIntArray()
    }
}
