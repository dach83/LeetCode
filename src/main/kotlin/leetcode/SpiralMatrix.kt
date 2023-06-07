package leetcode

/**
 * Problem description on [LeetCode](https://leetcode.com/problems/spiral-matrix/)
 */
class SpiralMatrix {

    sealed class Direction(
        protected val top: Int,
        protected val bottom: Int,
        protected val left: Int,
        protected val right: Int,
        val row: Int,
        val col: Int
    ) {

        class Right(top: Int, bottom: Int, left: Int, right: Int, row: Int, col: Int) :
            Direction(top, bottom, left, right, row, col) {
            override fun next(): Direction = if (col == right) {
                Down(top + 1, bottom, left, right, row + 1, col)
            } else {
                Right(top, bottom, left, right, row, col + 1)
            }
        }

        class Down(top: Int, bottom: Int, left: Int, right: Int, row: Int, col: Int) :
            Direction(top, bottom, left, right, row, col) {
            override fun next(): Direction = if (row == bottom) {
                Left(top, bottom, left, right - 1, row, col - 1)
            } else {
                Down(top, bottom, left, right, row + 1, col)
            }
        }

        class Left(top: Int, bottom: Int, left: Int, right: Int, row: Int, col: Int) :
            Direction(top, bottom, left, right, row, col) {
            override fun next(): Direction = if (col == left) {
                Up(top, bottom - 1, left, right, row - 1, col)
            } else {
                Left(top, bottom, left, right, row, col - 1)
            }
        }

        class Up(top: Int, bottom: Int, left: Int, right: Int, row: Int, col: Int) :
            Direction(top, bottom, left, right, row, col) {
            override fun next(): Direction = if (row == top) {
                Right(top, bottom, left + 1, right, row, col + 1)
            } else {
                Up(top, bottom, left, right, row - 1, col)
            }
        }

        abstract fun next(): Direction
    }

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var dir: Direction = Direction.Right(
            top = 0,
            left = 0,
            bottom = matrix.lastIndex,
            right = matrix.first().lastIndex,
            row = 0,
            col = 0
        )

        val count = matrix.size * matrix.first().size
        val list = mutableListOf<Int>()
        repeat(count) {
            val i = dir.row
            val j = dir.col
            list.add(matrix[i][j])
            dir = dir.next()
        }

        return list
    }
}
