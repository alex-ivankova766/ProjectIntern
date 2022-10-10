//Дан массив из целых чисел, вывести на экран элементы массива, которые больше соседних
// (предыдущего и следующего) элементов массива., Если элемент первый или последний, то его не выводим.
//используя цикл for
//используя цикл while
//используя оператор forEach


fun main() {
    val list: Array<Int> = arrayOf(1, 5, 4, 6, 2)
    list.forEachIndexed {index, element ->
        if (index >= 1 && index <= (list.size - 2) && element > list[index - 1] && element > list[index + 1]) {
            print("$element ")
        }

    }
}