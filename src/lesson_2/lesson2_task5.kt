package lesson_2

fun main() {
    val initialAmount = 70_000.0
    val interestRate = 0.167
    val years = 20

    val finalAmount = initialAmount * Math.pow(1 + interestRate, years.toDouble())

    println(String.format("%.3f", finalAmount))

}
