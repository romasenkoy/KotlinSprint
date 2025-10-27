package lesson_2

fun main() {
    val startHour = 9
    val startMinute = 39
    val travelTime = 457
    val minutesInHour = 60 //вынесла в константу

    // Отправление с начала дня переводим в минуты
    val departureInMinutes = startHour * minutesInHour + startMinute

    // Время прибытия в минутах с начала дня
    val arrivalInMinutes = departureInMinutes + travelTime

    // Час и минуты прибытия
    val arrivalHour = arrivalInMinutes / 60
    val arrivalMinute = arrivalInMinutes % 60

    print("Время прибытия - ")
    print(arrivalHour)
    print(":")
    print(arrivalMinute)
}


