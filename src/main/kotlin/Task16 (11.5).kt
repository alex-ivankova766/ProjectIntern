//Переделаем задачу с точками Point используя метод  messageParse() из предыдущего задания и немного его изменим.
//Метод
// messageParse(encryptedMessage:String, eventUp:(Int) -> Unit, eventDown:(Int) -> Unit, eventLeft:(Int) -> Unit, eventRight:(Int) -> Unit)
// будет принимать зашифрованное сообщение от Рика Санчеса из измерения Дупиду,
// и согласно расшифрованных данных передвигать летающую тарелку по оси координат.
//    Правила дешифровки сообщения:
//    - символ ‘a’- влево на 1 шаг
//    - символ ‘А’- влево на 2 шаг
//    - символы ‘d’ и ‘D’ - вправо соответственно
//    - символы ‘w’ и ‘W’ - вверх соответственно
//    - символы ‘s’ и ‘S’ - вниз соответственно
//
//
//Создать sealed класс Command, который содержит четыре data класса: Up(), Down(), Right(), Left().
// Эти вложенные классы содержат поле step:Int - количество шагов по оси.
//Создать класс Ufo в котором будет два изменяемых свойства, координаты x и y.
//В классе Ufo:
//- переопределить метод toString(), который будет возвращать текущее положение летающей тарелки
//- создать метод  move() который будет принимать в качестве параметра объект класса Command
// и в зависимости от вложенного типа изменять координаты тарелки.
// Также метод должен выводить в консоль  текст, например: “Тарелка Рика сместилась влево на 2”
//в main():
//- инициализировать объект Ufo с начальными координатами (0,0)
//- запустить расшифровку сообщения     , а в лямбдах событий сделать обработку - перемещение тарелки Рика.
//После каждой операции перемещения выводить в консоль текущее положение тарелки.

sealed class Command()
data class Up(val step: Int) : Command()
data class Down(val step: Int) : Command()
data class Right(val step: Int) : Command()
data class Left(val step: Int) : Command()

class Ufo(private var x: Int, private var y: Int) {
    override fun toString(): String {
        return "Тарелка находится в точке ($x, $y)"
    }

    fun move(command: Command) {
        val direction: String
        when (command) {
            is Up -> {
                direction = "вверх"
                y += command.step
                println("Тарелка Рика сместилась $direction на ${command.step}")
                println(this.toString())
            }
            is Down -> {
                direction = "вниз"
                y -= command.step
                println("Тарелка Рика сместилась $direction на ${command.step}")
                println(this.toString())
            }
            is Right -> {
                direction = "вправо"
                x += command.step
                println("Тарелка Рика сместилась $direction на ${command.step}")
                println(this.toString())
            }
            is Left -> {
                direction = "влево"
                x -= command.step
                println("Тарелка Рика сместилась $direction на ${command.step}")
                println(this.toString())
            }
        }
    }
}

fun messageParse(
    encryptedMessage: String,
    eventUp: (Int) -> Unit,
    eventDown: (Int) -> Unit,
    eventLeft: (Int) -> Unit,
    eventRight: (Int) -> Unit
) {
    for (char in encryptedMessage) {
        when (char) {
            'a' -> eventLeft(1)
            'A' -> eventLeft(2)
            'd' -> eventRight(1)
            'D' -> eventRight(2)
            'w' -> eventUp(1)
            'W' -> eventUp(2)
            's' -> eventDown(1)
            'S' -> eventDown(2)
        }
    }
}

fun main() {
    val sanchesUfo = Ufo(0, 0)
    messageParse(
        "wasdswaDSwaASWDsdw",
        { sanchesUfo.move(Up(it)) },
        { sanchesUfo.move(Down(it)) },
        { sanchesUfo.move(Left(it)) },
        { sanchesUfo.move(Right(it)) })
}

