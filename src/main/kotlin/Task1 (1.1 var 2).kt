//Task1 (1.1 var2):
//Пользователь вводит целое положительное число, вывести на экран сумму первой и последней цифры введенного числа.
//Использовать ввод с клавиатуры readline().
//Есть несколько способов:
//  1-й. преобразовать строку в число используя toInt(), и отделять цифры используя деление на 10 с остатком “%” и без остатка “/”
//  2-й. получить 1-й символ строки используя функцию first() и последний с помощью last().

fun readLineWithValidation():Int {
    var number = readLine().toString().toIntOrNull()
    while (number == null) {
        println("Только числа могут быть посчитаны! Введите число.")
        number = readLine().toString().toIntOrNull()
    }
    return number.toInt()
}

fun main() {
    println("Введите число и программа сосчитает сумму его первой и последней цифр")
    val enteredNumber = readLineWithValidation()
    val numberCalc = if (enteredNumber < 0) (-enteredNumber).toString() else enteredNumber.toString()
    val first = numberCalc.first().toString().toInt()
    val last = numberCalc.last().toString().toInt()
    val result = first + last

    println("Сумма первой и последней цифр числа $enteredNumber = $result")
}