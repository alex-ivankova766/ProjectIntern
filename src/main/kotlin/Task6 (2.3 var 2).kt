//Дан массив с элементами. Найдите произведение элементов этого массива, найдите min и max элемент.
//используя цикл for
//используя цикл while
//используя функцию reduce()
//используя оператор forEach
//используя функции min() max()
private const val MIN_PRODUCT = 1
private const val FIRST_INDEX = 0
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    var product = MIN_PRODUCT
    var minimum = Int.MAX_VALUE
    var maximum = Int.MIN_VALUE
    var index = FIRST_INDEX
    while (index != numbers.size) {
        product *= numbers[index]
        if (minimum > numbers[index]) {
            minimum = numbers[index]
        }
        if (maximum < numbers[index]) {
            maximum = numbers[index]
        }
        index++
    }
    println("Произведение чисел массива = $product")
    println("Самый маленький элемент массива = $minimum")
    println("Самый большой элемент массива = $maximum")
}