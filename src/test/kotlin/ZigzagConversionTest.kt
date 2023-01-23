import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class ZigzagConversionTest {

    private fun checkAnswer(expected: String, s: String, numRows: Int) {
        val sut = ZigzagConversion()

        val actual = sut.convert(s, numRows)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = "PAHNAPLSIIGYIR", s = "PAYPALISHIRING", numRows = 3)
    }

    @Test
    fun example2() {
        checkAnswer(expected = "PINALSIGYAHRPI", s = "PAYPALISHIRING", numRows = 4)
    }

    @Test
    fun example3() {
        checkAnswer(expected = "A", s = "A", numRows = 1)
    }
}
