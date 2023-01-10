/**
 * Problem description on [LeetCode](https://leetcode.com/problems/multiply-strings/)
 */
class MultiplyStrings {

    fun multiply(num1: String, num2: String): String {
        val components = initComponents(num1, num2)
        return sumComponents(components)
    }

    private fun initComponents(num1: String, num2: String): IntArray {
        val result = IntArray(num1.length + num2.length)
        for (i in num1.indices) {
            for (j in num2.indices) {
                val mul = multiplyDigit(num1[i], num2[j])
                result[i + j] += mul / 10
                result[i + j + 1] += mul % 10
            }
        }
        return result
    }

    private fun sumComponents(array: IntArray): String = buildString {
        var remains = 0
        for (i in array.reversed()) {
            val sum = i + remains
            append(sum % 10)
            remains = sum / 10
        }
        reverse()

        // delete leading zero
        while (first() == '0' && length > 1) {
            deleteCharAt(0)
        }
    }

    private fun multiplyDigit(digit1: Char, digit2: Char): Int {
        return charToInt(digit1) * charToInt(digit2)
    }

    private fun charToInt(digit: Char): Int {
        return digit - '0'
    }
}
