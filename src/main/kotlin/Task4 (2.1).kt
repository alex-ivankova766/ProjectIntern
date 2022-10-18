//Task4 (2.1):
//Вывести на экран n простых чисел начиная от 2.
//Простое число - это натуральное (целое положительное) число,
//имеющее ровно два различных натуральных делителя — единицу и самого себя.

fun isPrime(number: Int): Boolean {
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun countPrime(number: Int) {
    var checkedNumber = 2
    var count = 1
    println("Вот список первых $number простых чисел")
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
    var n = readLine().toString().toIntOrNull()
    while (n == null || n <= 0) {
        println("Программа не может запуститься, пока не будет введено натуральное число, введите, пожалуйста, n")
        n = readLine().toString().toIntOrNull()
    }
    countPrime(n)
}
