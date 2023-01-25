/**
 * Problem description on [LeetCode](https://leetcode.com/problems/string-to-integer-atoi/)
 */
class StringToInteger {

    enum class State {
        START,
        SIGN,
        DIGIT,
        END
    }

    private fun Char.isWhitespace() = (this == ' ')
    private fun Char.isSign() = (this == '+' || this == '-')
    private fun Char.digitToInt() = (this - '0')

    fun myAtoi(s: String): Int {
        var state = State.START
        var sign = 1
        var num = 0
        var i = 0

        loop@
        while (i < s.length) {
            when (state) {
                State.START ->
                    when {
                        s[i].isWhitespace() -> i++
                        s[i].isSign() -> state = State.SIGN
                        s[i].isDigit() -> state = State.DIGIT
                        else -> state = State.END
                    }

                State.SIGN -> {
                    if (s[i] == '-') sign = -1
                    state = State.DIGIT
                    i++
                }

                State.DIGIT ->
                    if (s[i].isDigit()) {
                        val d = s[i].digitToInt()

                        if (num > Int.MAX_VALUE / 10 || num == Int.MAX_VALUE / 10 && d > 7) {
                            return if (sign == -1) Int.MIN_VALUE else Int.MAX_VALUE
                        }

                        num = num * 10 + d
                        i++
                    } else {
                        state = State.END
                    }

                State.END -> {
                    break@loop
                }
            }
        }

        return num * sign
    }
}
