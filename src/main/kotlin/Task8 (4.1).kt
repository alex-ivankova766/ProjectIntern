//Создать класс, который содержит одномерный массив чисел (в конструктор передается массив чисел).
//В классе создать методы:
//для вычисления суммы положительных элементов
//для вычисления произведения элементов массива
//для вычисления среднего арифметического значения элементов массива
//Создать объект класса и вывести на экран результаты методов класса.
private const val MIN_SUM = 0

class ArrayNums(val numbers: Array<Int>) {
    fun sumPositiveNums(): Int {
        var resultSum = MIN_SUM
        for (num in numbers) {
            if (num > 0) resultSum += num
        }
        return resultSum
    }

    fun productNums(): Int {
        var resultCom = 1
        for (elem in numbers) resultCom *= elem
        return resultCom
    }

    fun arithmeticMean(): Double {
        var totalSum = MIN_SUM
        for (elem in numbers) totalSum += elem
        return totalSum.toDouble() / numbers.size.toDouble()
    }
}

fun main() {
    val myArray = ArrayNums(arrayOf(1, 2, 4, 8, -1, 1, -2))
    println("Сумма всех положительных элементов массива = ${myArray.sumPositiveNums()}")
    println("Произведение всех элементов массива = ${myArray.productNums()}")
    println("Среднее арифметическое всех элементов массива = ${myArray.arithmeticMean()}")
}