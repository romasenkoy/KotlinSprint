package lesson_1

fun main () {
    val year: String = "1962"
    var hour: String = "9"
    var minute:String = "07" // тут только возник вопрос, если эта переменная с типом String, то остальные можно оставить Int или тоже сделать String?

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"

    print(hour)
    print(":")
    print(minute)
}