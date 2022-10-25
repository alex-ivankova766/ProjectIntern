//Дан список с числами. Выделить все отрицательные элементы в новый список.
//Использовать функцию filter{}

fun main() {
    val numbers = arrayOf(0, -7, 5, 13, -22, 150)
    val negativeNumbers = numbers.filter { it < 0 }
}