/**
 * Problem description on [LeetCode](https://leetcode.com/problems/zigzag-conversion/)
 */
class ZigzagConversion {

    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s

        val rows = Array(numRows) { "" }

        var currRow = 0
        var moveDown = false
        for (ch in s) {
            rows[currRow] = rows[currRow] + ch
            if (currRow == 0 || currRow == numRows - 1) moveDown = !moveDown
            currRow += if (moveDown) 1 else -1
        }

        return rows.joinToString("")
    }
}
