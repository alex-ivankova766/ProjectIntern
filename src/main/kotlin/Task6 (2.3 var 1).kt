//Дан массив с элементами. Найдите произведение элементов этого массива, найдите min и max элемент.
//используя цикл for
//используя цикл while
//используя функцию reduce()
//используя оператор forEach
//используя функции min() max()

fun main() {
    val list = arrayOf(1, 2, 3, 4, 5)
    var product = 1
    var minimum = 10000000
    var maximum = -10000000
    for (elem in list) {
        product *= elem
        if (minimum > elem) {
            minimum = elem
        }
        if (maximum < elem) {
            maximum = elem
        }
    }
    println("Произведение чисел массива = $product")
    println("Самый маленький элемент массива = $minimum")
    println("Самый большой элемент массива = $maximum")
}