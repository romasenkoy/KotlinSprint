package lesson_1

/*
fun main() {
    // Количество секунд
    val Seconds = 6480  // это 108 минут

    // Часы
    val hours = Seconds / 3600
    //Минуты
    val minutes = (Seconds % 3600) / 60
    //Секунды
    val seconds = Seconds % 60 // Не понимаю, как вывести двумя символами ответ, поэтому последний print такой

    print(hours)
    print(":")
    print(minutes)
    print(":")
    print("00")
}*/

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val allSeconds = 10800  // общее количество секунд

    val hours = allSeconds / SECONDS_IN_HOUR
    val minutes = (allSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = allSeconds % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
