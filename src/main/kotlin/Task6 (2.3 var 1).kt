//Дан массив с элементами. Найдите произведение элементов этого массива, найдите min и max элемент.
//используя цикл for
//используя цикл while
//используя функцию reduce()
//используя оператор forEach
//используя функции min() max()
private const val MIN_PRODUCT = 1

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    var product = MIN_PRODUCT
    var minimum = Int.MAX_VALUE
    var maximum = Int.MIN_VALUE
    for (num in numbers) {
        product *= num
        if (minimum > num) {
            minimum = num
        }
        if (maximum < num) {
            maximum = num
        }
    }
    println("Произведение чисел массива = $product")
    println("Самый маленький элемент массива = $minimum")
    println("Самый большой элемент массива = $maximum")
}