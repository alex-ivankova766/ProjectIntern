//Дан список с числами. Сформировать новый список их квадратов.  Использовать функцию  map{}

fun main() {
    val numbers = arrayOf(0, -7, 5, 13, -22, 150)
    val squaresOfNumbers = numbers.map { it * it }
}