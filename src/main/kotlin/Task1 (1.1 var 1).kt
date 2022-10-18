//Task1 (1.1 var1):
//Пользователь вводит целое положительное число, вывести на экран сумму первой и последней цифры введенного числа.
//Использовать ввод с клавиатуры readline().
//Есть несколько способов:
//  1-й. преобразовать строку в число используя toInt(), и отделять цифры используя деление на 10 с остатком “%” и без остатка “/”
//  2-й. получить 1-й символ строки используя функцию first() и последний с помощью last().

fun readLineWithValidation2():Int {
    var number = readLine().toString().toIntOrNull()
    while (number == null) {
        println("Только числа могут быть посчитаны! Введите число.")
        number = readLine().toString().toIntOrNull()
    }
    return number.toInt()
}

fun main() {
    println("Введите число и программа сосчитает сумму его первой и последней цифр")
    val enteredNumber = readLineWithValidation2()
    var numberCalc = if (enteredNumber < 0) -enteredNumber else enteredNumber
    var result = numberCalc % 10
    var lastNum = 0
    while (numberCalc > 0) {
        lastNum = numberCalc
        numberCalc /= 10
    }
    result += lastNum
    println("Сумма первой и последней цифр числа $enteredNumber = $result")
}