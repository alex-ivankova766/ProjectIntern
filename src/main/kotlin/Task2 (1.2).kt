//Task2 (1.2):
//Пользователь вводит с клавиатуры любые числа, до тех пор пока не будет введено число “0”.
//После ввода нуля необходимо вывести на экран количество введенных чисел, их общую сумму и среднее арифметическое.
//Использовать ввод с клавиатуры readline().

fun readLineWithValidation3():Int {
    var number = readLine().toString().toIntOrNull()
    while (number == null) {
        println("Только числа могут быть посчитаны! Введите число.")
        number = readLine().toString().toIntOrNull()
    }
    return number.toInt()

}
fun main() {
    var sum = 0.0
    var count = 0.0
    var arithMean = 0.0
    println("Вы вводите сколько угодно чисел, я подсчитаю их количество и среднее арифметическое. Чтобы закончить ввод, введите 0, после каждого числа нажимайте Enter")
    var num = readLineWithValidation3()
    while (num != 0) {
        count += 1.0
        sum += num.toDouble()
        arithMean = sum / count
        println("Введите следующее число или 0, чтобы закончить")
        num = readLineWithValidation()
    }
    val countInt = count.toInt()
    println("Веедено чисел: $countInt, среднее арифметическое: $arithMean")
}