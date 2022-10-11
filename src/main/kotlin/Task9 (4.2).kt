//Создать класс содержит одномерный массив чисел.(в конструктор передается массив чисел)
//В классе создать методы:
//возвращает массив с удвоенными четными элементами, утроенными нечетными элементами
//возвращает max элемент массива,
//возвращает min элемент массива
//        Создать свойство которое получает сумму элементов массива.

class arrayNums42(val list: Array<Int>) {
    fun changeElems(): Array<Int> {
        val newList = list.clone()
        for (index in list.indices) {
            if (index % 2 == 1) {
                newList[index] = list[index] * 2
            } else {
                newList[index] = list[index] * 3
            }
        }
    return newList
    }
    fun maxElem(): Int {
        return list.max()
    }
    fun minElem(): Int {
        return list.min()
    }
    fun sumNums(): Int {
        var resultSum = 0
        for (elem in list) resultSum += elem
        return resultSum
    }
}

fun main() {
    val myArray = arrayNums42(arrayOf(1, 2, 4, 8, -1, 1, -2))
    println("Изменённый массив = ${myArray.changeElems().asList()}")
    println("Наибольший элемент массива = ${myArray.maxElem()}")
    println("Наименьший элемент массива = ${myArray.minElem()}")
    println("Сумма элементов массива = ${myArray.sumNums()}")
}