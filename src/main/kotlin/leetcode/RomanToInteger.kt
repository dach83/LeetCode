package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/roman-to-integer/)
 */
class RomanToInteger {

    private val mapRoman = mapOf(
        "IV" to 4,
        "IX" to 9,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900,
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )

    private fun nextRoman(s: String): String? {
        mapRoman.forEach {
            if (s.startsWith(it.key)) {
                return it.key
            }
        }
        return null
    }

    fun romanToInt(s: String): Int {
        var substr = s
        var result = 0
        while (substr.isNotEmpty()) {
            val roman = nextRoman(substr) ?: return 0
            result += mapRoman[roman]!!
            substr = substr.substring(roman.length)
        }
        return result
    }
}
