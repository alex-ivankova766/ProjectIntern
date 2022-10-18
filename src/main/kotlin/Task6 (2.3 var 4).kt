//Дан массив с элементами. Найдите произведение элементов этого массива, найдите min и max элемент.
//используя цикл for
//используя цикл while
//используя функцию reduce()
//используя оператор forEach
//используя функции min() max()


fun main() {
    val list = arrayOf(1, 2, 3, 4, 5)
    val product = list.reduce { prod, element -> prod * element }
    var minimum = 10000000
    var maximum = -10000000
    list.forEach {element ->
        if (minimum > element) {
            minimum = element
        }
        if (maximum < element) {
            maximum = element
        }
    }
    println("Произведение чисел массива = $product")
    println("Самый маленький элемент массива = $minimum")
    println("Самый большой элемент массива = $maximum")
}