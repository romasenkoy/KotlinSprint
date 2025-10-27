package lesson_3

fun main() {
    // до замужества
    var lastName = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20

    println("[${lastName} ${firstName} ${patronymic}, $age]")

    // после замужества
    lastName = "Сидорова"
    age = 22

    // Выводим данные в 22 года
    println("[${lastName} ${firstName} ${patronymic}, $age]")
}

