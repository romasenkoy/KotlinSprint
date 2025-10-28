package lesson_3

fun main() {
    // первый ход
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    // вывод первого хода
    var moveString = "[$from-$to;$moveNumber]"
    println(moveString)

    // второй хода
    from = "D2"
    to = "D3"
    moveNumber = 2

    // вывод второго хода
    moveString = "[" + from + "-" + to + ";" + moveNumber + "]"
    println(moveString)
}
