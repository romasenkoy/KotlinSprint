package lesson_2

fun main() {
    val employees = 50                 // количество постоянных сотрудников
    val interns = 30                   // количество стажёров
    val employeeSalary = 30000         // зарплата постоянного сотрудника
    val internSalary = 20000           // зарплата стажёра

    // 1️⃣ Расходы на зарплаты постоянных сотрудников
    val totalEmployeeSalary = employees * employeeSalary

    // 2️⃣ Общие расходы после прихода стажёров
    val totalAllSalary = totalEmployeeSalary + (interns * internSalary)

    // 3️⃣ Средняя зарплата после прихода стажёров
    val averageSalary = totalAllSalary / (employees + interns)

    // Выводим результаты
    println("Расходы на зарплаты постоянных сотрудников: $totalEmployeeSalary")
    println("Общие расходы после прихода стажёров: $totalAllSalary")
    println("Средняя зарплата после прихода стажёров: $averageSalary")
}
