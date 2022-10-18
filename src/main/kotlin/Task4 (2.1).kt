//Task4 (2.1):
//Вывести на экран n простых чисел начиная от 2.
//Простое число - это натуральное (целое положительное) число,
//имеющее ровно два различных натуральных делителя — единицу и самого себя.
private const val FIRST_PRIME_NUMBER = 2
private const val ONE = 1
private fun readLineWithValidation():Int {
    var n = readLine()?.toIntOrNull()
    while (n == null || n <= 0) {
        println("Программа не может запуститься, пока не будет введено натуральное число, введите, пожалуйста, n")
        n = readLine()?.toIntOrNull()
    }
    return n
}
fun isPrime(number: Int): Boolean {
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
fun countPrime(number: Int) {
    var checkedNumber = FIRST_PRIME_NUMBER
    var count = ONE
    println("Вот список первых $number простых чисел:")
    println("${count}-е по счёту натуральное число = $checkedNumber")
    while (count != number) {
        checkedNumber++
        while (!isPrime(checkedNumber)) {
            checkedNumber++
        }
        count++
        println("${count}-е по счёту натуральное число = $checkedNumber")
    }
}
fun main() {
    println("Я программа, которая может вывести в консоль n первых простых чисел, введите натуральное число n")
    val n = readLineWithValidation()
    countPrime(n)
}
