package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/*
- 0
- 1
- 2
- 3
- ...
- 9
- Two digits
- Three digits
- Negative numbers (come up with our own negative symbol syntax)
 */
class NumberToLcdTests {
    @Test
    fun zero() {
        val result = numberToLcd(0)
        val expected = """
             _
            | |
            |_|
        """.trimIndent()
        assertEquals(expected, result)
    }
}
