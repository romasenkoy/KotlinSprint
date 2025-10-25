package lesson_1

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

}