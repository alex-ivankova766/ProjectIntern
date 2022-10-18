//Создать класс, который содержит одномерный массив чисел (в конструктор передается массив чисел).
//В классе создать методы:
//для вычисления суммы положительных элементов
//для вычисления произведения элементов массива
//для вычисления среднего арифметического значения элементов массива
//Создать объект класса и вывести на экран результаты методов класса.

class arrayNums(val list: Array<Int>) {
    fun sumPosNums(): Int {
        var resultSum = 0
        for (elem in list) {
            if (elem > 0) resultSum += elem
        }
        return resultSum
    }
    fun comNums(): Int {
        var resultCom = 1
        for (elem in list) resultCom *= elem
        return resultCom
    }
    fun arithMath(): Double {
        var totalSum = 0
        for (elem in list) totalSum += elem
        return totalSum.toDouble() / list.size.toDouble()
    }
}

fun main() {
    val myArray = arrayNums(arrayOf(1, 2, 4, 8, -1, 1, -2))
    println("Сумма всех положительных элементов массива = ${myArray.sumPosNums()}")
    println("Произведение всех элементов массива = ${myArray.comNums()}")
    println("Среднее арифметическое всех элементов массива = ${myArray.arithMath()}")
}