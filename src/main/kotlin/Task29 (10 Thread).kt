//Написать две функции imitationOne() и imitationTwo().
// В в теле каждой функции запустить цикл for (i in 1..10).
// В теле цикла сделать приостановку потока на 1 секунду (Thread.sleep(1000))
// и вывод на экран сообщения “One $i” для ф-ии  imitationOne()
// и  “Two $i” для ф-ии  imitationTwo(0). где i - счетчик цикла.
//в теле main()  поочередно вызвать следующие методы:
//- println(“Начало Main”)
//- imitationTwo()
//- imitationOne()
//- println(“Конец Main”)
//Запустить программу, проанализировать полученный результат
//Обернуть вызов imitationTwo() и imitationOne()  в один Thread
//Thread{
//    imitationTwo()
//    imitationOne()
//    }.start()
//Запустить программу, проанализировать полученный результат
//Обернуть вызов imitationTwo() и imitationOne() каждый в свой Thread.
// В одном из методов изменить время блокировки потока на 1,5 секунды Thread.sleep(1500)
//Запустить программу, проанализировать полученный результат

private fun imitationOne(sleepTime: Long=1000) {
    for (i in 1..10) {
        Thread.sleep(sleepTime)
        println("One $i")
    }
}
private fun imitationTwo(sleepTime: Long=1000) {
    for (i in 1..10) {
        Thread.sleep(sleepTime)
        println("Two $i")
    }
}
fun main() {
    println("Начало Main")
    imitationTwo()
    imitationOne()
    println("Конец Main")
    Thread {
        imitationTwo(1500)
    }.start()
    Thread {
        imitationOne()
    }.start()
}

//Вывод: внутри Thread функции выполняются последовательно, так же как и в main.
//Два последовательно запущенных Thread каждый со своей функцией работают параллельно.