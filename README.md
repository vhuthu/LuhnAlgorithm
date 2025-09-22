📦 Luhn Algorithm Kotlin Library

A lightweight Kotlin library to validate and generate Luhn check digits.
Useful for validating credit card numbers, IDs, and other identifiers that follow the Luhn algorithm.

🚀 Installation

Add the following to your settings.gradle:

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}


Then, in your build.gradle (app-level):

dependencies {
    implementation("com.github.vhuthu:LuhnAlgorithm:1.0")
}

📖 Usage
✅ Validate a number

Check if a string (e.g. credit card number) is valid:

import com.vhuthu.luhn.isValidLuhn

fun main() {
    val cardNumber = "4539578763621486"
    println(cardNumber.isValidLuhn()) // true
}

🔢 Calculate a check digit

Find the check digit required to make a number valid:

import com.vhuthu.luhn.calculateLuhnCheckDigit

fun main() {
    val partialNumber = "7992739871"
    val checkDigit = partialNumber.calculateLuhnCheckDigit()

    println(checkDigit) // 3
    println((partialNumber + checkDigit).isValidLuhn()) // true
}

📌 Extension Functions Available

String.isValidLuhn(): Boolean
→ Returns true if the string passes the Luhn check.

String.calculateLuhnCheckDigit(): Int
→ Returns the check digit (0–9) to append to make the number valid.

🛠 Example: Credit Card Validation in Android
val cardNumber = "4539578763621486"

if (cardNumber.isValidLuhn()) {
    println("Valid card ✅")
} else {
    println("Invalid card ❌")
}

⚡ Version

1.0 → Initial release with validation & check digit calculation.
