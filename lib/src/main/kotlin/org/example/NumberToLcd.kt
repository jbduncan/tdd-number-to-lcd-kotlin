package org.example

fun numberToLcd(number: Int): String {
    if (number == 1) {
        return """
        
            |
            |
        """.trimIndent()
    }
    return """
         _
        | |
        |_|
    """.trimIndent()
}
