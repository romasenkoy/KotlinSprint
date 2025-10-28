package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val startHour = 9
    val startMinute = 39
    val travelTime = 457
    // val minutesInHour = 60 //вынесла в константу

    // Отправление с начала дня переводим в минуты
    val departureInMinutes = startHour * MINUTES_IN_HOUR + startMinute

    // Время прибытия в минутах с начала дня
    val arrivalInMinutes = departureInMinutes + travelTime

    // Час и минуты прибытия
    val arrivalHour = arrivalInMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalInMinutes % MINUTES_IN_HOUR

    print("Время прибытия - ")
    print(arrivalHour)
    print(":")
    print(arrivalMinute)
}


