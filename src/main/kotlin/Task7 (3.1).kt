
// Решение квадратного уравнения ax2 + bx + c = 0.
//https://www.berdov.com/docs/equation/quadratic_equations/
//Написать функцию sqr(n), которая в качестве параметра принимает число n и возвращает квадрат этого числа.
//Написать функцию discriminant(a,b,c),
// которая в качестве параметров принимает коэффициенты a,b и c заданного уравнения.
// Возвращает рассчитанный дискриминант.
//Написать функцию  rootsNumber(a,b,c),
// которая в качестве параметров принимает коэффициенты a,b и c заданного уравнения.
// Данная функция в зависимости от дискриминанта должна определить и вернуть
// количество корней заданного квадратного уравнения.
//Реализовать с помощью конструкции when().
//Написать функцию quadraticRoot(a,b,c),
// которая в качестве параметров принимает коэффициенты a,b и c заданного уравнения.
// Данная функция должна вывести на экран корни заданного квадратного уравнения.
//При реализации этой функции необходимо использовать ранее написанные функции.
import kotlin.math.sqrt

private const val ZERO = 0
private const val POS_SIGN = 1
private const val NEG_SIGN = -1

fun sqr(n: Int) = n * n
fun discriminant(a: Int, b: Int, c: Int) = sqr(b) - 4 * a * c
fun rootsNumber(a: Int, b: Int, c: Int): Int {
    var result = ZERO
    when {
        discriminant(a, b, c) < 0 -> result = 0
        discriminant(a, b, c) == 0 -> result = 1
        discriminant(a, b, c) > 0 -> result = 2
    }
    return result
}
fun quadraticRoot(a: Int, b: Int, c: Int): Unit {
    var sign = POS_SIGN
    if (rootsNumber(a, b, c) == 0) {
        println("Корней нет.")
    }
    for (i in 1..rootsNumber(a, b, c)) {
        val x = (sign * sqrt(discriminant(a, b, c).toDouble()) - b) / (2 * a)
        println("x${i} = $x")
        sign = NEG_SIGN
    }
}

fun main() {
    quadraticRoot(1, -5, 6)
}