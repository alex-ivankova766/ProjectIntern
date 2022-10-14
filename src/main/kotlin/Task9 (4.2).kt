//Создать класс содержит одномерный массив чисел.(в конструктор передается массив чисел)
//В классе создать методы:
//возвращает массив с удвоенными четными элементами, утроенными нечетными элементами
//возвращает max элемент массива,
//возвращает min элемент массива
//        Создать свойство которое получает сумму элементов массива.

class arrayNums42(val numbers: Array<Int>) {
    fun changeElems(): Array<Int> {
        val tempArray = numbers.clone()
        for (index in numbers.indices) {
            if (index % 2 == 1) {
                tempArray[index] = numbers[index] * 2
            } else {
                tempArray[index] = numbers[index] * 3
            }
        }
        return tempArray
    }

    fun maxElem() = numbers.max()
    fun minElem() = numbers.min()
    val sumNums = numbers.sum()
}

fun main() {
    val myArray = arrayNums42(arrayOf(1, 2, 4, 8, -1, 1, -2))
    println("Изменённый массив = ${myArray.changeElems().asList()}")
    println("Наибольший элемент массива = ${myArray.maxElem()}")
    println("Наименьший элемент массива = ${myArray.minElem()}")
    println("Сумма элементов массива = ${myArray.sumNums}")
}