//Дан список с числами (1,2,3,4,5,6,7).
// При инициализации списка использовать IntRange.
// Вывести на экран список по примеру “=1+2+3+4+5+6+7=”.
//Использовать функцию joinToString().

fun main() {
    val numbers: List<Int> = IntRange(1, 7).toList()
    println(numbers.joinToString(separator = "+", prefix = "=", postfix = "="))
}