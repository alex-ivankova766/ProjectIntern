//Создать класс Vector, который описывает вектор (в трехмерном пространстве).
//Конструктор в качестве параметров принимает список координат x, y, z.
//В классе создать методы:
//для вычисления длины вектора sqrt(x * x + y * y + z * z)
//для вычисления скалярного произведения векторов
//x1*x2+y1*y2 +z1*z2. В качестве параметра метод принимает объект класса Vector
//добавить в предыдущее задание к функции ключевое слово infix и реализовать инфиксную запись между двумя векторами.
//описать функцию скалярного произведения векторов, чтобы выражение приняло вид
// Vector(1.0,2.0,3.0) * Vector(3.0,2.0,1.0)
//Вне класса создать функцию скалярного произведения, которая в качестве  параметров принимает два вектора (объекты типа Vector).
import kotlin.math.sqrt

private fun sqr(n: Double): Double = n * n

class Vector(val x: Double, val y: Double, val z: Double) {
    fun lengthVector(): Double {
        return sqrt(sqr(x) + sqr(y) + sqr(z))
    }

    fun scalarProduct(vector2: Vector): Double {
        val x2 = vector2.x
        val y2 = vector2.y
        val z2 = vector2.z
        return x * x2 + y * y2 + z * z2
    }

    operator fun times(vector2: Vector): Double {
        return Vector(x, y, z).scalarProduct(vector2)
    }
}

fun scalarProductVector(vector1: Vector, vector2: Vector): Double {
    val x1 = vector1.x
    val y1 = vector1.y
    val z1 = vector1.z
    val x2 = vector2.x
    val y2 = vector2.y
    val z2 = vector2.z
    return x1 * x2 + y1 * y2 + z1 * z2
}

fun main() {
    val vector1 = Vector(3.0, 4.0, 0.0)
    val vector2 = Vector(-1.0, -2.0, -3.0)
    println("Длина вектора vector1 = ${vector1.lengthVector()}")
    println("Длина вектора vector2 = ${vector2.lengthVector()}")
    println("Скалярное произведение vector1 и vector2 = ${vector1.scalarProduct(vector2)}")
    println(
        "Скалярное произведение Vector(3.0, 4.0 ,5.0) и Vector(-1.0, -2.0, -3.0) = ${
            Vector(3.0, 4.0, 5.0) * Vector(-1.0, -2.0, -3.0)
        }"
    )
    println(
        "Скалярное произведение vector1 и vector2 с использованием внешней функции тоже равно ${
            scalarProductVector(vector2, vector1)
        }"
    )
}