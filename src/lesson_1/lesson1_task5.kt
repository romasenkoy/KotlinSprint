package lesson_1

fun main() {
    // Количество секунд
    val Seconds = 6480  // 108 минут

    // Часы
    val hours = Seconds / 3600
    //Минуты
    val minutes = (Seconds % 3600) / 60
    //Секунды
    val seconds = Seconds % 60 // как вывести двумя нолями не понимаю

    print(hours)
    print(":")
    print(minutes)
    print(":")
    print(seconds)
}