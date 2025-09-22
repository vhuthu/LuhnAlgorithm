package com.vhuthuk.luhn_checker

// Extension function to check if a string passes the Luhn algorithm
fun String.isValidLuhn(): Boolean {
    val digits = this.filter { it.isDigit() }.map { it.digitToInt() }
    if (digits.isEmpty()) return false

    val checksum = digits
        .reversed()
        .mapIndexed { index, digit ->
            if (index % 2 == 1) {
                val doubled = digit * 2
                if (doubled > 9) doubled - 9 else doubled
            } else digit
        }
        .sum()

    return checksum % 10 == 0
}

// Extension function to calculate the Luhn check digit for a string
fun String.calculateLuhnCheckDigit(): Int {
    val digits = this.filter { it.isDigit() }.map { it.digitToInt() }
    val sum = digits
        .reversed()
        .mapIndexed { index, digit ->
            if (index % 2 == 0) {
                val doubled = digit * 2
                if (doubled > 9) doubled - 9 else doubled
            } else digit
        }
        .sum()

    return (10 - (sum % 10)) % 10
}
