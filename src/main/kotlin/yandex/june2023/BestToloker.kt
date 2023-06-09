package yandex.june2023

import java.io.File

class BestToloker {

    fun solve(input: String): String {
        val lines = input.lines()

        // количкство толокеров, дней и периодов
        val (n, d, p) = lines[0].split(" ").map { it.toInt() }

        // работы
        val tolokers = Array(n) { IntArray(d+1) }
        for (i in 1..n) {
            val workDay = lines[i].split(" ").map { it.toInt() }
            // сумма работ нарастающим итогом
            workDay.forEachIndexed { index, dayWorkCount ->
                tolokers[i-1][index + 1] = tolokers[i-1][index] + dayWorkCount
            }
        }

        // периоды
        val result = IntArray(p)
        for (i in n + 1..n + p) {
            val (start, finish) = lines[i].split(" ").map { it.toInt() }
            result[i-n-1] = bestTolokersCountForPeriod(tolokers, start, finish)
        }

        println(result.joinToString ("\n"))
        return result.joinToString ( "\n" )
    }

    private fun bestTolokersCountForPeriod(tolokers: Array<IntArray>, start: Int, finish: Int): Int {
        var max = 0
        var count = 0
        tolokers.forEach { workSum ->
            val workForPeriod = workSum[finish+1] - workSum[start]
            if (max < workForPeriod) {
                max = workForPeriod
                count = 1
            } else if (max == workForPeriod) {
                count++
            }
        }
        return if (max == 0) 0 else count
    }

}


fun main() {
    val input = File("input.txt").readText()
    BestToloker().solve(input)
}