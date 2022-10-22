//Пользователь вводит с клавиатуры два числа, знак операции (+,-,* или /) и выполняет над числами указанную операцию.

fun eval(firstNum: Int, operator: Char, secondNum: Int): Int {
    return when (operator) {
        '-' -> firstNum - secondNum
        '+' -> firstNum + secondNum
        '/' -> firstNum / secondNum
        else -> firstNum * secondNum
    }
}

fun main() {
    var match: MatchResult? = null
    val regex = Regex("\\s*(?<firstNum>\\d+)\\s*(?<operator>[+\\-/*])\\s*(?<secondNum>\\d+)\\s*")
    do {
        println("Введите, пожалуйста, число, знак математической операции -+/* и ещё одно число.")
        val task = readLine()
        if (task != null) {
            match = regex.matchEntire(task)
        }
    } while (match == null)

    val firstNum = match.groups["firstNum"]!!.value.toInt()
    val operator = match.groups["operator"]!!.value[0]
    val secondNum = match.groups["secondNum"]!!.value.toInt()

    println(eval(firstNum, operator, secondNum))
}