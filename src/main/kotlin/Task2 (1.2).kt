//Task2 (1.2):
//Пользователь вводит с клавиатуры любые числа, до тех пор пока не будет введено число “0”.
//После ввода нуля необходимо вывести на экран количество введенных чисел, их общую сумму и среднее арифметическое.
//Использовать ввод с клавиатуры readline().
private const val ZERO = 0
private const val ZERO_FRACTION = 0.0
private fun readLineWithValidation():Int {
    var number = readLine()?.toIntOrNull()
    while (number == null) {
        println("Только числа могут быть посчитаны! Введите число.")
        number = readLine()?.toIntOrNull()
    }
    return number

}
fun main() {
    var sum = ZERO_FRACTION
    var count = ZERO
    println("Вы вводите сколько угодно чисел, я подсчитаю их количество и среднее арифметическое. Чтобы закончить ввод, введите 0, после каждого числа нажимайте Enter")
    var num = readLineWithValidation()
    while (num != 0) {
        count++
        sum += num
        println("Введите следующее число или 0, чтобы закончить")
        num = readLineWithValidation()
    }
    val arityMean = sum / count
    println("Веедено чисел: $count, их сумма: $sum среднее арифметическое: $arityMean")
}