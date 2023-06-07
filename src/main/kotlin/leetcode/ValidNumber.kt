package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/valid-number/)
 */
class ValidNumber {

    fun isNumber(s: String): Boolean {
        var state: State = State.Blank
        return try {
            s.forEach {
                state = state.handle(it)
            }
            when (state) {
                State.Decimal -> true
                State.DotAfterInteger -> true
                State.Integer -> true
                State.IntegerAfterExp -> true
                State.Blank -> false
                State.DotBeforeInteger -> false
                State.Exp -> false
                State.Sign -> false
                State.SignAfterExp -> false
            }
        } catch (cause: Exception) {
            false
        }
    }
}

sealed class State {

    open fun handle(ch: Char): State {
        throw IllegalStateException()
    }

    object Blank : State() {
        override fun handle(ch: Char): State = when (ch) {
            '+', '-' -> Sign
            '.' -> DotBeforeInteger
            in '0'..'9' -> Integer
            else -> super.handle(ch)
        }
    }

    object Sign : State() {
        override fun handle(ch: Char): State = when (ch) {
            in '0'..'9' -> Integer
            '.' -> DotBeforeInteger
            else -> super.handle(ch)
        }
    }

    object Integer : State() {
        override fun handle(ch: Char): State = when (ch) {
            in '0'..'9' -> Integer
            'e', 'E' -> Exp
            '.' -> DotAfterInteger
            else -> super.handle(ch)
        }
    }

    object DotBeforeInteger : State() {
        override fun handle(ch: Char): State = when (ch) {
            in '0'..'9' -> Decimal
            else -> super.handle(ch)
        }
    }

    object DotAfterInteger : State() {
        override fun handle(ch: Char): State = when (ch) {
            in '0'..'9' -> Decimal
            'e', 'E' -> Exp
            else -> super.handle(ch)
        }
    }

    object Decimal : State() {
        override fun handle(ch: Char): State = when (ch) {
            in '0'..'9' -> Decimal
            'e', 'E' -> Exp
            else -> super.handle(ch)
        }
    }

    object Exp : State() {
        override fun handle(ch: Char): State = when (ch) {
            '-', '+' -> SignAfterExp
            in '0'..'9' -> IntegerAfterExp
            else -> super.handle(ch)
        }
    }

    object SignAfterExp : State() {
        override fun handle(ch: Char): State = when (ch) {
            in '0'..'9' -> IntegerAfterExp
            else -> super.handle(ch)
        }
    }

    object IntegerAfterExp : State() {
        override fun handle(ch: Char): State = when (ch) {
            in '0'..'9' -> IntegerAfterExp
            else -> super.handle(ch)
        }
    }
}
