//Дан массив из целых чисел, вывести на экран элементы массива, которые больше соседних
// (предыдущего и следующего) элементов массива., Если элемент первый или последний, то его не выводим.
//используя цикл for
//используя цикл while
//используя оператор forEach
private const val SECOND_INDEX = 1

fun main() {
    val numbers: Array<Int> = arrayOf(1, 5, 4, 6, 2)
    var index = SECOND_INDEX
    while (index != numbers.lastIndex) {
        if (numbers[index] > numbers[index - 1] && numbers[index] > numbers[index + 1]) {
            print("${numbers[index]} ")
        }
        index++
    }
}
