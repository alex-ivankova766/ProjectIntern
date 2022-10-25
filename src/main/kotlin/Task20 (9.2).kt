////Дан список с числами. Изменить знак для всех положительных элементов списка.

fun main() {
    val mNumbers = mutableListOf(0, -7, 5, 13, -22, 150)
    for (index in mNumbers.indices) {
        if (mNumbers[index] > 0) {
            mNumbers[index] *= (-1)
        }
    }
}