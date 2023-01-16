import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class WildcardMatchingTest {

    private fun checkAnswer(expected: Boolean, s: String, p: String) {
        val sut = WildcardMatching()

        val actual = sut.isMatch(s, p)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun example1() {
        checkAnswer(expected = false, s = "aa", p = "a")
    }

    @Test
    fun example2() {
        checkAnswer(expected = true, s = "aa", p = "*")
    }

    @Test
    fun example3() {
        checkAnswer(expected = false, s = "cb", p = "?a")
    }

    @Test
    fun example4() {
        checkAnswer(expected = true, s = "adceb", p = "*a*b")
    }

    @Test
    fun example5() {
        checkAnswer(expected = true, s = "", p = "******")
    }

    @Test
    fun example6() {
        checkAnswer(
            expected = false,
            s = "aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba",
            p = "a*******b"
        )
    }

    @Test
    fun example7() {
        checkAnswer(
            expected = false,
            s = "babbbbaabababaabbababaababaabbaabababbaaababbababaaaaaabbabaaaabababbabbababbbaaaababbbabbbbbbbbbbaabbb",
            p = "b**bb**a**bba*b**a*bbb**aba***babbb*aa****aabb*bbb***a"
        )
    }

    @Test
    fun example8() {
        checkAnswer(
            expected = false,
            s = "abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb",
            p = "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"
        )
    }

    @Test
    fun example9() {
        checkAnswer(expected = true, s = "abcabczzzde", p = "*abc???de*")
    }

    @Test
    fun example10() {
        checkAnswer(expected = false, s = "aab", p = "c*a*b")
    }
}
