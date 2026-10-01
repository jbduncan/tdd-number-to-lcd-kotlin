package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
- DONE: 0
- DONE: 1
- 2
- @ParameterizedTest
- 3
- ...
- 9
- Two digits
- Three digits
- Negative numbers (come up with our own negative symbol syntax)
 */
class NumberToLcdTests {
    @Test
    fun integerZeroToLcdZero() {
        val result = numberToLcd(0)
        val expected = """
             _
            | |
            |_|
        """.trimIndent()
        assertEquals(expected, result)
    }

    @Test
    fun integerOneToLcdOne() {
        val result = numberToLcd(1)
        val expected = """

            |
            |
        """.trimIndent()
        assertEquals(expected, result)
    }

    @Test
    fun integerTwoToLcdTwo() {
        val result = numberToLcd(2)
        val expected = """
             _
             _|
            |_
        """.trimIndent()
        assertEquals(expected, result)
    }
}
