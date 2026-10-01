package org.example

fun numberToLcd(number: Int): String {
    if (number == 1) {
        return """
        
            |
            |
        """.trimIndent()
    } else if (number == 2) {
        return """
             _
             _|
            |_
        """.trimIndent()
    } else {
        return """
             _
            | |
            |_|
        """.trimIndent()
    }
}
