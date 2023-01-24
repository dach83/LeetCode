import kotlin.math.abs

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/reverse-integer/)
 */
class ReverseInteger {

    fun reverse(x: Int): Int = try {
        val sign = if (x < 0) "-" else ""
        val reversed = abs(x).toString().reversed()
        "$sign$reversed".toInt()
    } catch (e: Exception) {
        0
    }
}
