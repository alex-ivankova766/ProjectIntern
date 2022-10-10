//Дан массив из целых чисел, вывести на экран элементы массива, которые больше соседних
// (предыдущего и следующего) элементов массива., Если элемент первый или последний, то его не выводим.
//используя цикл for
//используя цикл while
//используя оператор forEach


fun main() {
    val list: Array<Int> = arrayOf(1, 5, 4, 6, 2)
    val lastIndex = list.size - 2
    for (seqNum in 1..lastIndex) {
        if (list[seqNum] > list[seqNum - 1] && list[seqNum] > list[seqNum + 1]) {
            print("${list[seqNum]} ")
        }
    }
}