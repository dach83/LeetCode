package yandex.june2023

import com.google.common.truth.Truth
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ParallelWorkTimeTest {

    private fun checkAnswer(expected: Long, input: String) {
        val sut = ParallelWorkTime()

        val actual = sut.solve(input)

        Truth.assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val expected = 4L
        val input = """
            20 4 7
            1 10 15 19
            3 5 12 14 16 17 18
        """.trimIndent()
        checkAnswer(expected, input)
    }

}