package yandex.june2023

import java.io.File

class ParallelWorkTime {

    fun solve(input: String): Long {
        val lines = input.lines()

        // разбор первой строки
        val (n, c1, c2) = lines[0].split(" ").map { it.toLong() }

        // временные метки
        val times1 = lines[1].split(" ").map { it.toLong() }.toLongArray()
        val times2 = lines[2].split(" ").map { it.toLong() }.toLongArray()

        var ind1 = 0
        var ind2 = 0
        var sum = 0L
        while (ind1 < times1.size && ind2 < times2.size) {
            val start1 = times1[ind1]
            val finish1 = times1.getOrElse(ind1 + 1) { n }
            val start2 = times2[ind2]
            val finish2 = times2.getOrElse(ind2 + 1) { n }

            val startMax = maxOf(start1, start2)
            val finishMin = minOf(finish1, finish2)
            if (startMax < finishMin) {
                sum += finishMin - startMax
            }

            if (finish1 < finish2) {
                ind1 += 2
            } else {
                ind2 += 2
            }
        }

        println(sum)
        return sum
    }
}

fun main() {
    val input = File("input.txt").readText()
    ParallelWorkTime().solve(input)
}
