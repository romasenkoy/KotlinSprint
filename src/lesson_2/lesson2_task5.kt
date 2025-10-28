package lesson_2

fun main() {
    val initialAmount = 70_000.0      // начальная сумма
    val interestRate = 0.167          // 16.7%
    val years = 20                    // количество лет

    // Формула сложных процентов
    val finalAmount = initialAmount * Math.pow(1 + interestRate, years.toDouble())

    // Вывод с 3 знаками после запятой
    println(String.format("%.3f", finalAmount))

}
