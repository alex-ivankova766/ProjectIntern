//Дан массив из целых чисел, вывести на экран элементы массива, которые больше соседних
// (предыдущего и следующего) элементов массива., Если элемент первый или последний, то его не выводим.
//используя цикл for
//используя цикл while
//используя оператор forEach


fun main() {
    val list: Array<Int> = arrayOf(1, 5, 4, 6, 2)
    var index = 1
    while (index != (list.size - 1)) {
        if (list[index] > list[index - 1] && list[index] > list[index + 1]) {
            print("${list[index]} ")
        }
        index++
    }
}