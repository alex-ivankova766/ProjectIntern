//Дан массив с элементами. Найдите произведение элементов этого массива, найдите min и max элемент.
//используя цикл for
//используя цикл while
//используя функцию reduce()
//используя оператор forEach
//используя функции min() max()


fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val product = numbers.reduce { product, element -> product * element }
    val minimum = numbers.min()
    val maximum = numbers.max()

    println("Произведение чисел массива = $product")
    println("Самый маленький элемент массива = $minimum")
    println("Самый большой элемент массива = $maximum")
}