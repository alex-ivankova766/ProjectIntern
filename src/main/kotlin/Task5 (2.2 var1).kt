//Дан массив из целых чисел, вывести на экран элементы массива, которые больше соседних
// (предыдущего и следующего) элементов массива., Если элемент первый или последний, то его не выводим.
//используя цикл for
//используя цикл while
//используя оператор forEach


fun main() {
    val numbers: Array<Int> = arrayOf(1, 5, 4, 6, 2)
    val BEFORE_LAST_INDEX = numbers.size - 2
    for (index in 1..BEFORE_LAST_INDEX) {
        if (numbers[index] > numbers[index - 1] && numbers[index] > numbers[index + 1]) {
            print("${numbers[index]} ")
        }
    }
}