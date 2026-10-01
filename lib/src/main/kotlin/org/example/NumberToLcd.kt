package org.example

fun numberToLcd(number: Int): String {
    if (number == 1) {
        return LCD_1
    } else if (number == 2) {
        return LCD_2
    } else {
        return LCD_0
    }
}

private val LCD_0 = """
     _
    | |
    |_|
""".trimIndent()
private val LCD_1 = """
        
    |
    |
""".trimIndent()
private val LCD_2 = """
     _
     _|
    |_
""".trimIndent()
