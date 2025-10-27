package lesson_2

fun main() {
    val crystal = 7
    val iron = 11
    val buffPercent = 20

    val crystalBonus = (crystal * buffPercent) / 100
    val ironBonus = (iron * buffPercent) / 100

    println("Кристаллическая руда: " + crystalBonus)
    println("Железная руда: " + ironBonus)
}
