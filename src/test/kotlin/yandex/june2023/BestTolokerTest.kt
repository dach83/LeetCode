package yandex.june2023

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class BestTolokerTest {

    private fun checkAnswer(expected: String, input: String) {
        val sut = BestToloker()

        val actual = sut.solve(input)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        val expected = """
            1
            2
            0
        """.trimIndent()
        val input = """
            2 3 3
            3 5 0
            4 5 0
            0 0
            1 1
            2 2
        """.trimIndent()
        checkAnswer(expected, input)
    }

    @Test
    fun example2() {
        val input = """
            3 6 2
            2 5 0 5 3 3
            4 3 0 1 2 3
            2 3 0 6 2 1
            0 1
            3 5
        """.trimIndent()
        val expected = """
            2
            1
        """.trimIndent()
        checkAnswer(expected, input)
    }
}
