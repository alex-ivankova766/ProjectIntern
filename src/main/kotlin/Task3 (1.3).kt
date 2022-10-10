//Task3 (1.3):
//Программа “Угадай число”. Отгадать целое число которое “загадал” компьютер.
//Программа генерирует рандомное число A (используем (0..10).random()),
//пользователь вводит свой вариант-число B.
//Если число В>A выводим сообщение “Много” и повторяем ввод,
//если В<А выводим сообщение “Мало”и повторяем ввод, иначе “Угадал”.

fun readLineWithValidation4():Int {
    var number = readLine().toString().toIntOrNull()
    while (number == null) {
        println("Компьютер загадал число! Введите число.")
        number = readLine().toString().toIntOrNull()
    }
    return number.toInt()
}

fun main() {
    val hiddenNumber = (0..10).random()
    println("Угадай число от 0 до 10, которое загадал компьютер :)")
    var num = readLineWithValidation4()
    while (num != hiddenNumber) {
        if (num < hiddenNumber) println("Мало. Попытайтесь снова.")
        if (num > hiddenNumber) println("Много. Попытайтесь снова.")
        num = readLineWithValidation()
    }
    println("Угадал")
}