package lesson_2

fun main() {
    val StartHour = 9
    val StartMinute = 39
    val TravelTime = 457

    // Отправление с начала дня переводим в минуты
    val DepartureInMinutes = StartHour * 60 + StartMinute

    // Время прибытия в минутах с начала дня
    val ArrivalInMinutes = DepartureInMinutes + TravelTime

    // Час и минуты прибытия
    val ArrivalHour = ArrivalInMinutes / 60
    val ArrivalMinute = ArrivalInMinutes % 60

    print("Время прибытия - ")
    print(ArrivalHour)
    print(":")
    print(ArrivalMinute)
}


