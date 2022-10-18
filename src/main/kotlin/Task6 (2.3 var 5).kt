//Дан массив с элементами. Найдите произведение элементов этого массива, найдите min и max элемент.
//используя цикл for
//используя цикл while
//используя функцию reduce()
//используя оператор forEach
//используя функции min() max()


fun main() {
    val list = arrayOf(1, 2, 3, 4, 5)
    val product = list.reduce { prod, element -> prod * element }
    val minimum = list.min()
    val maximum = list.max()

    println("Произведение чисел массива = $product")
    println("Самый маленький элемент массива = $minimum")
    println("Самый большой элемент массива = $maximum")
}